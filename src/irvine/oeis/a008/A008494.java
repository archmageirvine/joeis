package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008494 Expansion of (1-x^12) / (1-x)^12.
 * @author Sean A. Irvine
 */
public class A008494 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008494() {
    super(
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}

