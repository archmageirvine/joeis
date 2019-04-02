package irvine.oeis.a047;

import irvine.oeis.CoordinationSequence;

/**
 * A047965 Coordination sequence T3 for Zeolite Code MSO.
 * @author Sean A. Irvine
 */
public class A047965 extends CoordinationSequence {

  /** Construct the sequence. */
  public A047965() {
    super(
      new long[] {1, 4, 12, 21, 30, 42, 52, 56, 48, 35, 17, -4, -17, -33, -46, -52, -54, -44, -34, -21, -8, -4, 1, 0, -2},
      new int[] {4, 4, 5, 9});
  }
}
