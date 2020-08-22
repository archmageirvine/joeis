package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249354 a(n) = n*(3*n^2 + 3*n + 1).
 * @author Sean A. Irvine
 */
public class A249354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249354() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 7, 38, 111});
  }
}
