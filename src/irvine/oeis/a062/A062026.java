package irvine.oeis.a062;

import irvine.oeis.LinearRecurrence;

/**
 * A062026 a(n) = n(n+1)(n^2 -3n +6)/4.
 * @author Sean A. Irvine
 */
public class A062026 extends LinearRecurrence {

  /** Construct the sequence. */
  public A062026() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 2, 6, 18, 50});
  }
}
