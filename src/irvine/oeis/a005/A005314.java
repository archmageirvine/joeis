package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005314 For <code>n = 0, 1, 2, a(n) =</code> n; thereafter, <code>a(n) = 2*a(n-1) - a(n-2) + a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A005314 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005314() {
    super(new long[] {1, -1, 2}, new long[] {0, 1, 2});
  }
}
