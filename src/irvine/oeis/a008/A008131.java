package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008131 Coordination sequence T3 for Zeolite Code LIO.
 * @author Sean A. Irvine
 */
public class A008131 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008131() {
    super(
      new long[] {1, 3, 6, 10, 14, 17, 19, 22, 24, 22, 18, 18, 22, 24, 22, 19, 17, 14, 10, 6, 3, 1},
      new int[] {1, 5, 15});
  }
}
