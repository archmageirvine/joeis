package irvine.oeis.a267;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A267027 "Polyrhythmic sequence" P(3,4): numbers congruent to 1 mod 3 (A016777) or 1 mod 4 (A016813).
 * @author Sean A. Irvine
 */
public class A267027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267027() {
    super(1, new long[] {-1, 2, -2, 2, -2, 2}, new long[] {1, 4, 5, 7, 9, 10});
  }
}
