package irvine.oeis.a070;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A070484 a(n) = n^3 mod 22.
 * @author Georg Fischer
 */
public class A070484 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A070484() {
    super(0, new long[] {0, -1, -8, -5, -20, -15, -18, -13, -6, -3, -10, -11, -12, -19, 
      -16, -9, -4, -7, -2, -17, -14, -21},
      new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
      0, 0, 0, 1});
  }
}
