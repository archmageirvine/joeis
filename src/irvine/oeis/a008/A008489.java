package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008489 Expansion of (1-x^7)/(1-x)^7.
 * @author Sean A. Irvine
 */
public class A008489 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008489() {
    super(
      new long[] {1, 0, 0, 0, 0, 0, 0, -1},
      new int[] {1, 1, 1, 1, 1, 1, 1});
  }
}

