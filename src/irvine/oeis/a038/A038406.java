package irvine.oeis.a038;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A038406 Coordination sequence T1 for Zeolite Code AWO.
 * @author Sean A. Irvine
 */
public class A038406 extends CoordinationSequence {

  /** Construct the sequence. */
  public A038406() {
    super(
      new long[] {1, 4, 10, 20, 34, 50, 64, 72, 74, 74, 68, 54, 40, 26, 11, 0, -11, -26, -40, -54, -68, -74, -74, -72, -64, -50, -34, -20, -10, -4, -1},
      new int[] {4, 5, 7, 14});
  }
}
