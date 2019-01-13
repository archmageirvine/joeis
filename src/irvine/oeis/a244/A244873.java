package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244873.
 * @author Sean A. Irvine
 */
public class A244873 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244873() {
    super(new long[] {-1, 7, -20, 28, -14, -14, 28, -20, 7}, new long[] {1, 29, 289, 1640, 6604, 21122, 57271, 137155, 298184});
  }
}
