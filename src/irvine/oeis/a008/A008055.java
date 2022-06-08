package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008055 Coordination sequence T1 for Zeolite Code BPH.
 * @author Sean A. Irvine
 */
public class A008055 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008055() {
    super(
      new long[] {1, 4, 9, 16, 23, 29, 34, 40, 45, 39, 23, 6, -12, -36, -58, -75, -87, -84, -71, -58, -44, -23, 0, 25, 47, 51, 42, 33, 30, 27, 20, 9, -1, -5, -4, 0, 2, 2, 1},
      new int[] {3, 4, 8, 8, 10});
  }
}

