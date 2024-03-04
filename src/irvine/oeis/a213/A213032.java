package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213032 a(n) = floor(n/2)*floor(n/3)-floor(n/6)^2.
 * @author Sean A. Irvine
 */
public class A213032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213032() {
    super(new long[] {1, -1, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 1}, new long[] {0, 0, 0, 1, 2, 2, 5, 5, 7, 11, 14, 14, 20});
  }
}
