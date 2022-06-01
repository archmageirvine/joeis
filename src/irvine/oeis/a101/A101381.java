package irvine.oeis.a101;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A101381 a(n) = n^2*(n+1)^2*(4*n^2 - 5*n + 4)/12.
 * @author Sean A. Irvine
 */
public class A101381 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101381() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 30, 300, 1600, 5925, 17346});
  }
}
