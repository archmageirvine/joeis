package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008493 Expansion of (1-x^11) / (1-x)^11.
 * @author Sean A. Irvine
 */
public class A008493 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008493() {
    super(
      new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1},
      new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
  }
}

