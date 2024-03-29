package irvine.oeis.a323;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A323951 Number of ways to split an n-cycle into connected subgraphs, all having at least three vertices.
 * @author Georg Fischer
 */
public class A323951 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A323951() {
    super(0, new long[] {-1, 3, -3, 1, 0, 0, -2, 1},
      new long[] {-1, 3, -3, 2, -2, 1});
  }
}
