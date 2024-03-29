package irvine.oeis.a318;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A318791 Prime generating polynomial: a(n) = 9*n^2 - 249*n + 1763.
 * @author Georg Fischer
 */
public class A318791 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A318791() {
    super(1, new long[] {0, -1523, 3268, -1763},
      new long[] {-1, 3, -3, 1});
  }
}
