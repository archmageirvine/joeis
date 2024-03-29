package irvine.oeis.a291;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A291706 Number of connected dominating sets in the n-ladder graph.
 * @author Georg Fischer
 */
public class A291706 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A291706() {
    super(1, new long[] {0, -3, -3, -3, 1},
      new long[] {-1, 2, 1});
  }
}
