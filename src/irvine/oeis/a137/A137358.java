package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137358 <code>a(n) = Sum_{k &lt;= n/2 } binomial(n-2k, 3k+2)</code>.
 * @author Sean A. Irvine
 */
public class A137358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137358() {
    super(new long[] {1, 0, 1, -3, 3}, new long[] {0, 0, 1, 3, 6});
  }
}
