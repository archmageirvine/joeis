package irvine.oeis.a008;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A008094 Coordination sequence T2 for Zeolite Code ERI.
 * @author Sean A. Irvine
 */
public class A008094 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008094() {
    super(
      new long[] {1, 4, 10, 20, 32, 45, 60, 79, 102, 122, 130, 126, 122, 126, 130, 122, 102, 79, 60, 45, 32, 20, 10, 4, 1},
      new int[] {5, 7, 12});
  }
}
