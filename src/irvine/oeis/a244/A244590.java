package irvine.oeis.a244;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A244590 a(n) = sum( floor(k*n/8), k=1..7 ).
 * @author Georg Fischer
 */
public class A244590 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A244590() {
    super(0, new long[] {0, 0, 4, 3, 5, 2, 4, 3, 7},
      new long[] {1, -1, 0, 0, 0, 0, 0, 0, -1, 1});
  }
}
