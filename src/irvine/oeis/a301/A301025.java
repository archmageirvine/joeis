package irvine.oeis.a301;

import irvine.oeis.CoordinationSequence;

/**
 * A301025 Coordination sequence <code>T5</code> for Zeolite Code EZT.
 * @author Sean A. Irvine
 */
public class A301025 extends CoordinationSequence {

  /** Construct the sequence. */
  public A301025() {
    super(
      new long[] {1, 4, 9, 18, 29, 46, 64, 75, 83, 85, 70, 49, 24, -16, -47, -67, -86, -92, -81, -68, -51, -29, -15, -6, 2, 3, 0, 1, 0, -3, -2},
      new int[] {5, 5, 7, 8});
  }
}

