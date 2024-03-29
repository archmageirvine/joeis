package irvine.oeis.a321;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A321416 Number of n element multisets of the 10th roots of unity with zero sum.
 * @author Georg Fischer
 */
public class A321416 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A321416() {
    super(0, new long[] {1, -1, 1, -1, 1},
      new long[] {1, -1, -4, 4, 6, -7, -3, 8, -3, -7, 6, 4, -4, -1, 1});
  }
}
