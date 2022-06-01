package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114211 a(n) = (5*n^3+12*n^2+n+6)/6.
 * @author Sean A. Irvine
 */
public class A114211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114211() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 4, 16, 42});
  }
}
