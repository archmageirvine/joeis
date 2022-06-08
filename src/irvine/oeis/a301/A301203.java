package irvine.oeis.a301;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A301203 Coordination sequence T2 for Zeolite Code SOS.
 * @author Sean A. Irvine
 */
public class A301203 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301203() {
    super(
      new long[] {1, 4, 8, 15, 26, 41, 58, 69, 70, 71, 70, 54, 29, 10, -5, -16, -29, -48, -62, -64, -65, -68, -68, -56, -34, -13, 0, 1, 3, 6, 1, -5, -3, -1},
      new int[] {4, 5, 7, 12});
  }
}

