package irvine.oeis.a038;

import irvine.oeis.CoordinationSequence;

/**
 * A038402 Coordination sequence T2 for Zeolite Code AFN.
 * @author Sean A. Irvine
 */
public class A038402 extends CoordinationSequence {

  /** Construct the sequence. */
  public A038402() {
    super(
      new long[] {1, 4, 9, 17, 27, 40, 53, 64, 71, 67, 62, 53, 35, 13, -12, -33, -51, -63, -71, -73, -63, -53, -44, -30, -15, -5, -3, -1, 3, 3, 0, -3, -2},
      new int[] {3, 6, 8, 10});
  }
}
