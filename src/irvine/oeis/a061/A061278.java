package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061278 <code>a(n) = 5*a(n-1) - 5*a(n-2) + a(n-3)</code> with <code>a(1) = 1</code> and a(k) <code>= 0</code> if k <code>&lt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A061278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061278() {
    super(new long[] {1, -5, 5}, new long[] {0, 1, 5});
  }
}
