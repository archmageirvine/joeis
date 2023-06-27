package irvine.oeis.a115;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A115056 a(n) = n*(n^2-1)*(3*n+2).
 * @author Sean A. Irvine
 */
public class A115056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115056() {
    super(-1, new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 0, 48, 264});
  }
}
