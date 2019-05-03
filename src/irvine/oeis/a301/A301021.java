package irvine.oeis.a301;

import irvine.oeis.CoordinationSequence;

/**
 * A301021 Coordination sequence <code>T1</code> for Zeolite Code EZT.
 * @author Sean A. Irvine
 */
public class A301021 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301021() {
    super(
      new long[] {1, 4, 10, 19, 31, 47, 64, 77, 85, 89, 87, 77, 63, 48, 31, 15, 0, -15, -31, -48, -63, -77, -87, -89, -85, -77, -64, -47, -31, -19, -10, -4, -1},
      new int[] {5, 5, 8, 14});
  }
}

