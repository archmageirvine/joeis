package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036800 a(n) = -6 + 2^(n+1)*(3 - 2*n + n^2).
 * @author Sean A. Irvine
 */
public class A036800 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036800() {
    super(new long[] {-8, 20, -18, 7}, new long[] {0, 2, 18, 90});
  }
}
