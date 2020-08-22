package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255377 Number of strings of n decimal digits that contain at least one string of exactly 7 consecutive "0" digits.
 * @author Sean A. Irvine
 */
public class A255377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255377() {
    super(new long[] {-90, 99, -9, 0, 0, 0, 0, 0, -100, 20}, new long[] {0, 0, 0, 0, 0, 0, 0, 1, 18, 261});
  }
}
