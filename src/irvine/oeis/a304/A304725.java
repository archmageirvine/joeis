package irvine.oeis.a304;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A304725 a(n) = n^4 + 8*n^3 + 20*n^2 + 16*n + 2.
 * @author Georg Fischer
 */
public class A304725 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A304725() {
    super(0, new long[] {2, 37, -21, 7, -1},
      new long[] {1, -5, 10, -10, 5, -1});
  }
}
