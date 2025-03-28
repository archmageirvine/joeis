package irvine.oeis.a019;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A019485 a(n) = 2*a(n-1) + 2*a(n-2) - 3*a(n-3), with a(0) = 2, a(1) = 5, a(2) = 12.
 * @author Sean A. Irvine
 */
public class A019485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019485() {
    super(new long[] {-3, 2, 2}, new long[] {2, 5, 12});
  }
}
