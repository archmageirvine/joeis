package irvine.oeis.a070;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A070350 a(n) = 2^n mod 45.
 * @author Georg Fischer
 */
public class A070350 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A070350() {
    super(0, new long[] {-1, -2, -4, -8, -16, -32, -19, -38, -31, -17, -34, -23},
      new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1});
  }
}
