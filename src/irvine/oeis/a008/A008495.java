package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008495 Expansion of (1-x^13) / (1-x)^13.
 * @author Sean A. Irvine
 */
public class A008495 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008495() {
    super(
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}

