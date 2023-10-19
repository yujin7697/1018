package com.example.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 생성 전략 사용 (예: MySQL의 AUTO_INCREMENT)
    private Long id;

    @Column(unique = true)
    private String email;
    private String password;

    private String nickname;
    private String name;
    private String phone;
    private String birth;
    private String zipcode;
    private String addr1;
    private String addr2;
    private String role;
    private String profile; //프로필 사진 저장
    private String question;
    private String answer;


    //OAuth2 Added
    private String provider;
    private String providerId;




}