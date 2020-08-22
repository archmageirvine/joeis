package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173562 a(n) = n^2 + floor(n/4).
 * @author Sean A. Irvine
 */
public class A173562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173562() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {0, 1, 4, 9, 17, 26});
  }
}
