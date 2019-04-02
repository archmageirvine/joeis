package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008132 Coordination sequence T1 for Zeolite Code LOS.
 * @author Sean A. Irvine
 */
public class A008132 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008132() {
    super(
      new long[] {1, 3, 6, 10, 14, 17, 19, 22, 24, 22, 19, 17, 14, 10, 6, 3, 1},
      new int[] {1, 5, 10});
  }
}
