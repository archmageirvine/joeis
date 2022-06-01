package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061278 a(n) = 5*a(n-1) - 5*a(n-2) + a(n-3) with a(1) = 1 and a(k) = 0 if k &lt;= 0.
 * @author Sean A. Irvine
 */
public class A061278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061278() {
    super(new long[] {1, -5, 5}, new long[] {0, 1, 5});
  }
}
