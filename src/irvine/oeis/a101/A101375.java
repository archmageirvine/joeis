package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101375 a(n) = n*(n+1)*(n^2-2*n+2)/2.
 * @author Sean A. Irvine
 */
public class A101375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101375() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 6, 30, 100});
  }
}
