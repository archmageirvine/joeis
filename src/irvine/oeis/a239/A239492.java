package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239492 The fifth bicycle lock sequence: <code>a(n)</code> is the maximum value of min{x*y, (5-x)*(n-y)} over <code>0 &lt;= x &lt;= 5, 0 &lt;=</code> y <code>&lt;= n</code> for integers <code>x,</code> y.
 * @author Sean A. Irvine
 */
public class A239492 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239492() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 0, 2, 3, 4, 6});
  }
}
