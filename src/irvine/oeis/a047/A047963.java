package irvine.oeis.a047;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A047963 Coordination sequence T1 for Zeolite Code MSO.
 * @author Sean A. Irvine
 */
public class A047963 extends CoordinationSequence {

  /** Construct the sequence. */
  public A047963() {
    super(
      new long[] {1, 4, 10, 21, 36, 50, 61, 70, 78, 83, 81, 74, 62, 44, 23, 0, -23, -44, -62, -74, -81, -83, -78, -70, -61, -50, -36, -21, -10, -4, -1},
      new int[] {4, 5, 9, 12});
  }
}
