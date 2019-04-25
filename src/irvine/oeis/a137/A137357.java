package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137357 <code>a(n) = Sum_{k &lt;= n/2 } binomial(n-2k, 3k+1)</code>.
 * @author Sean A. Irvine
 */
public class A137357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137357() {
    super(new long[] {1, 0, 1, -3, 3}, new long[] {0, 1, 2, 3, 4});
  }
}
