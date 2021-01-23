package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008048 Coordination sequence T2 for Zeolite Code BIK.
 * @author Sean A. Irvine
 */
public class A008048 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008048() {
    super(
      new long[] {1, 4, 12, 24, 31, 30, 15, -12, -55, -76, -67, -36, 11, 30, 43, 32, 12, 4, -3},
      new int[] {3, 3, 4, 4, 4});
  }
}

