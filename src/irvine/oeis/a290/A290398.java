package irvine.oeis.a290;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A290398 Number of tiles in distance d from a given heptagon in the truncated order-3 tiling of the heptagonal plane (a.k.a. the "hyperbolic soccerball").
 * @author Georg Fischer
 */
public class A290398 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A290398() {
    super(0, new long[] {1, 6, 6, 6, 1},
      new long[] {1, -1, -1, -1, 1});
  }
}
