package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008013 Coordination sequence occurring in Zeolite Codes AFG, CAN, LIO, LOS.
 * @author Sean A. Irvine
 */
public class A008013 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008013() {
    super(
      new long[] {1, 3, 6, 10, 14, 18, 18, 14, 10, 6, 3, 1},
      new int[] {1, 5, 5});
  }
}

