package irvine.oeis.a019;

import irvine.oeis.CoordinationSequence;

/**
 * A019453 Coordination sequence <code>T3</code> for Zeolite Code CGF.
 * @author Sean A. Irvine
 */
public class A019453 extends CoordinationSequence {

  /** Construct the sequence. */
  public A019453() {
    super(
      new long[] {1, 4, 9, 18, 33, 50, 62, 65, 66, 62, 39, 4, -33, -57, -65, -73, -72, -56, -35, -16, -6, -1, 3, 2, -1, -2, -1},
      new int[] {4, 5, 6, 7});
  }
}
