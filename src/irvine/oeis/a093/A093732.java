package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093732 Number of connected relations.
 * @author Sean A. Irvine
 */
public class A093732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093732() {
    super(new long[] {9374400, -7643820, 2575088, -462525, 47548, -2774, 84}, new long[] {1, 211, 14221, 636331, 23679901, 805351531, 26175881341L});
  }
}
