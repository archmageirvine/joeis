package irvine.oeis.a027;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A027949 a(n) = T(2n,n+1), T given by A027948.
 * @author Georg Fischer
 */
public class A027949 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A027949() {
    super(1, new long[] {0, -1, 2, -14, 14, -6, 1},
      new long[] {-1, 6, -13, 13, -6, 1});
  }
}
