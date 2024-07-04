package irvine.oeis.a160;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A160791 a(n) = binomial(N, n - N) where N = 1 + floor(n/2).
 * @author Sean A. Irvine
 */
public class A160791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A160791() {
    super(1, new long[] {1, 0, -3, 0, 3, 0}, new long[] {1, 1, 2, 3, 3, 6});
  }
}
