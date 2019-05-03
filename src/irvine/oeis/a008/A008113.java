package irvine.oeis.a008;

import irvine.oeis.CoordinationSequence;

/**
 * A008113 Coordination sequence <code>T3</code> for Zeolite Code GOO.
 * @author Sean A. Irvine
 */
public class A008113 extends CoordinationSequence {

  /** Construct the sequence. */
  public A008113() {
    super(
      new long[] {1, 4, 9, 17, 28, 37, 35, 28, 18, 2, -14, -30, -38, -39, -39, -40, -39, -39, -36, -28, -16, 2, 18, 30, 35, 35, 28, 19, 9, 2, -1, 0, 2},
      new int[] {3, 3, 5, 7, 12});
  }
}
