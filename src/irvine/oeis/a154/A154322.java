package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154322 a(n) = 1 + n + binomial(n+3,5).
 * @author Sean A. Irvine
 */
public class A154322 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154322() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 2, 4, 10, 26, 62});
  }
}
