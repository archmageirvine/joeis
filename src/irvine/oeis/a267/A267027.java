package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267027 "Polyrhythmic sequence" <code>P(3,4)</code>: numbers congruent to <code>1 mod 3</code> (A016777) or <code>1 mod 4</code> (A016813).
 * @author Sean A. Irvine
 */
public class A267027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267027() {
    super(new long[] {-1, 2, -2, 2, -2, 2}, new long[] {1, 4, 5, 7, 9, 10});
  }
}
