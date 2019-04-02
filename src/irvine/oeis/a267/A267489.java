package irvine.oeis.a267;

import irvine.oeis.LinearRecurrence;

/**
 * A267489 a(n) = n^2 - 4*floor(n^2/6).
 * @author Sean A. Irvine
 */
public class A267489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A267489() {
    super(new long[] {1, -2, 1, 0, 0, 0, -1, 2}, new long[] {0, 1, 4, 5, 8, 9, 12, 17});
  }
}
