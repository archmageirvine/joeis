package irvine.oeis.a301;

import irvine.oeis.recur.CoordinationSequence;

/**
 * A301158 Coordination sequence T6 for Zeolite Code PON.
 * @author Sean A. Irvine
 */
public class A301158 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301158() {
    super(
      new long[] {1, 4, 10, 21, 37, 52, 62, 74, 85, 80, 63, 49, 21, -21, -47, -63, -80, -85, -75, -64, -52, -37, -21, -9, -4, -1},
      new int[] {4, 5, 8, 8});
  }
}

