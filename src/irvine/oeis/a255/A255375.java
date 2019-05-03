package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255375 Number of strings of n decimal digits that contain at least one string of exactly 5 consecutive <code>"0"</code> digits.
 * @author Sean A. Irvine
 */
public class A255375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255375() {
    super(new long[] {-90, 99, -9, 0, 0, 0, -100, 20}, new long[] {0, 0, 0, 0, 0, 1, 18, 261});
  }
}
