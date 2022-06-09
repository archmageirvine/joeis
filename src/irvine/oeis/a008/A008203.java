package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008203 Coordination sequence T1 for Zeolite Code NAT.
 * @author Sean A. Irvine
 */
public class A008203 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008203() {
    super(
      new long[] {1, 4, 9, 18, 31, 43, 58, 67, 77, 79, 67, 66, 49, 39, 28, 15, 2, -1, 2, 0, -6, -6, 0, -2, -2, -4, 2, 2, 2},
      new int[] {3, 6, 8});
  }
}
