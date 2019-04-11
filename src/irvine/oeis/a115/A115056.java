package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115056 <code>a(n) = n*(n^2-1)*(3*n+2)</code>.
 * @author Sean A. Irvine
 */
public class A115056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115056() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 0, 48, 264});
  }
}
