package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008226 Coordination sequence T8 for Zeolite Code PAU.
 * @author Sean A. Irvine
 */
public class A008226 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008226() {
    super(
      new long[] {1, 3, 5, 9, 14, 17, 20, 25, 25, 24, 27, 27, 26, 24, 28, 31, 22, 21, 31, 29, 24, 25, 23, 23, 22, 21, 15, 4, 2, 6, 4, 0, -2, -1, 2, -1, 0, 2, -3, -3, 2, 2},
      new int[] {1, 7, 22});
  }
}
