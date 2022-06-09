package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008224 Coordination sequence T6 for Zeolite Code PAU.
 * @author Sean A. Irvine
 */
public class A008224 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008224() {
    super(
      new long[] {1, 3, 5, 8, 12, 16, 20, 23, 25, 27, 28, 28, 27, 26, 26, 26, 26, 26, 27, 28, 28, 27, 25, 23, 20, 16, 12, 8, 5, 3, 1},
      new int[] {1, 7, 22});
  }
}
