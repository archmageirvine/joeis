package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292061 a(n) = (n-3)*(n-2)^2*(n-1)^2*n/24.
 * @author Sean A. Irvine
 */
public class A292061 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292061() {
    super(1, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 6, 60, 300, 1050});
  }
}
