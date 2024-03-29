package irvine.oeis.a085;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A085464 Number of monotone n-weightings of complete bipartite digraph K(4,2).
 * @author Georg Fischer
 */
public class A085464 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A085464() {
    super(1, new long[] {0, 1, 12, 22, 12, 1},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
