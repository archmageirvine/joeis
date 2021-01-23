package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008139 Coordination sequence T2 for Zeolite Code LTL.
 * @author Sean A. Irvine
 */
public class A008139 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008139() {
    super(
      new long[] {1, 4, 10, 21, 35, 49, 66, 88, 112, 135, 155, 171, 178, 171, 155, 135, 112, 88, 66, 49, 35, 21, 10, 4, 1},
      new int[] {7, 8, 9});
  }
}
