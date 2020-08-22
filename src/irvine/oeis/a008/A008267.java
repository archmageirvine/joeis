package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008267 Coordination sequence T1 for Coesite.
 * @author Sean A. Irvine
 */
public class A008267 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008267() {
    super(
      new long[] {1, 4, 10, 21, 42, 68, 87, 84, 44, -4, -99, -195, -250, -279, -220, -100, 31, 168, 275, 283, 253, 166, 36, -47, -101, -127, -93, -54, -23, 16, 11, 8, 3, -5, -9, -9, 0, 1, 2, 1},
      new int[] {3, 4, 5, 6, 6, 7});
  }
}

