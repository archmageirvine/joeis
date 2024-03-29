package irvine.oeis.a188;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A188551 Numbers located at angle turns in a pentagonal spiral.
 * @author Georg Fischer
 */
public class A188551 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A188551() {
    super(1, new long[] {0, -1, -1, -1, -1, -1, 0, 0, 0, 1},
      new long[] {-1, 1, 0, 0, 0, 2, -2, 0, 0, 0, -1, 1});
  }
}
