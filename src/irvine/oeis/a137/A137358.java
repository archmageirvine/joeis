package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137358 <code>a(n) =</code> Sum_{k <code>&lt;= n/2 }</code> binomial(n-2k, 3k+2).
 * @author Sean A. Irvine
 */
public class A137358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137358() {
    super(new long[] {1, 0, 1, -3, 3}, new long[] {0, 0, 1, 3, 6});
  }
}
