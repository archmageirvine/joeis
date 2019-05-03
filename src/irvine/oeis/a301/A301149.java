package irvine.oeis.a301;

import irvine.oeis.CoordinationSequence;

/**
 * A301149 Coordination sequence <code>T2</code> for Zeolite Code OSO.
 * @author Sean A. Irvine
 */
public class A301149 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301149() {
    super(
      new long[] {1, 4, 8, 15, 24, 26, 36, 16, 5, -44, -57, -89, -82, -23, -2, 48, 62, 44, 19, -4, -6, -1, -10, 8, 2},
      new int[] {3, 4, 4, 5, 5});
  }
}

