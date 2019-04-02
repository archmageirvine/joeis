package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163661 a(n) = n*(2*n^2 +5*n +17)/2.
 * @author Sean A. Irvine
 */
public class A163661 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163661() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 12, 35, 75});
  }
}
