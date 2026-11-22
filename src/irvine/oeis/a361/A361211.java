package irvine.oeis.a361;

import irvine.oeis.NoncomputableSequence;

/**
 * A361211 Busy Beaver for the Binary Lambda Calculus (BLC) language BBλ2: the maximum output size of self-delimiting BLC programs of size n, or 0 if no program of size n exists.
 * @author Gregory Morse
 */
public class A361211 extends NoncomputableSequence {
  // Known maxima for self-delimiting BLC programs.
  /** Construct the sequence. */
  public A361211() {
    super(1, NONCOMPUTABLE, 0, 0, 0, 0, 0, 4, 0, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 22, 24, 26, 30, 42, 52, 44, 64, 223, 160);
  }
}
