package irvine.oeis.a054;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A054136 a(n) = T(n,2), array T as in A054134.
 * @author Georg Fischer
 */
public class A054136 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A054136() {
    super(2, new long[] {0, 0, 2, -4, 6, -4, 1},
      new long[] {1, -5, 9, -7, 2});
  }
}
