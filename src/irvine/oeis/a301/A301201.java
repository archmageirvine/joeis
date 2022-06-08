package irvine.oeis.a301;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A301201 Coordination sequence T4 for Zeolite Code SIV.
 * @author Sean A. Irvine
 */
public class A301201 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301201() {
    super(
      new long[] {1, 4, 9, 17, 28, 39, 47, 52, 55, 58, 60, 58, 56, 58, 60, 58, 56, 58, 60, 58, 55, 52, 47, 39, 28, 17, 9, 4, 1},
      new int[] {3, 5, 20});
  }
}

