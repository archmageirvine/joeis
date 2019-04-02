package irvine.oeis.a019;

import irvine.oeis.CoordinationSequence;

/**
 * A019451 Coordination sequence T1 for Zeolite Code CGF.
 * @author Sean A. Irvine
 */
public class A019451 extends CoordinationSequence {

  /** Construct the sequence. */
  public A019451() {
    super(
      new long[] {1, 4, 11, 22, 33, 45, 60, 73, 71, 49, 22, 0, -22, -49, -71, -73, -60, -45, -33, -22, -11, -4, -1},
      new int[] {4, 5, 6, 7});
  }
}
