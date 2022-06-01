package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255379 Number of strings of n decimal digits that contain at least one string of exactly 9 consecutive "0" digits.
 * @author Sean A. Irvine
 */
public class A255379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255379() {
    super(new long[] {-90, 99, -9, 0, 0, 0, 0, 0, 0, 0, -100, 20}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 18, 261});
  }
}
