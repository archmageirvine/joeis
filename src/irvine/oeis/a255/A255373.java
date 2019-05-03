package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255373 Number of strings of n decimal digits that contain at least one string of exactly 3 consecutive <code>"0"</code> digits.
 * @author Sean A. Irvine
 */
public class A255373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255373() {
    super(new long[] {-90, 99, -9, 0, -100, 20}, new long[] {0, 0, 0, 1, 18, 261});
  }
}
