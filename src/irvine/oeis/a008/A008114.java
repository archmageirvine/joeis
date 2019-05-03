package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008114 Coordination sequence <code>T4</code> for Zeolite Code GOO.
 * @author Sean A. Irvine
 */
public class A008114 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008114() {
    super(
      new long[] {1, 4, 10, 18, 26, 37, 39, 27, 8, -4, -6, -17, -40, -49, -38, -32, -38, -49, -40, -17, -6, -4, 8, 27, 39, 37, 26, 18, 10, 4, 1},
      new int[] {3, 3, 5, 7, 12});
  }
}
