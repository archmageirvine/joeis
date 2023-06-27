package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101854 a(n) = n*(n+1)*(n^2 + 21*n + 50)/24.
 * @author Sean A. Irvine
 */
public class A101854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101854() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {6, 24, 61, 125, 225});
  }
}
