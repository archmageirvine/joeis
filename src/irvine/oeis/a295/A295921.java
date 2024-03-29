package irvine.oeis.a295;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A295921 Number of (not necessarily maximal) cliques in the n-folded cube graph.
 * @author Georg Fischer
 */
public class A295921 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A295921() {
    super(2, new long[] {0, 0, -4, 4, 23, -44, 20},
      new long[] {-1, 5, -8, 4});
  }
}
