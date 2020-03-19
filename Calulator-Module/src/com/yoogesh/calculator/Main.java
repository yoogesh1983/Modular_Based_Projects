package com.yoogesh.calculator;

import com.yoogesh.math.Addition;

public class Main {
	
	public static void main(String[] args) {
		
		Addition addition = new Addition();
		int result = addition.add(10,20);
		System.out.println("Result is: " + result);
	}

	
}
