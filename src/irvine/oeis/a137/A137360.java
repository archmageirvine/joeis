package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137360 <code>a(n) =</code> Sum_{k <code>&lt;= n/2 }</code> k*binomial(n-2k, <code>3k+1)</code>.
 * @author Sean A. Irvine
 */
public class A137360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137360() {
    super(new long[] {-1, 0, -2, 6, -7, 8, -15, 20, -15, 6}, new long[] {0, 0, 0, 0, 0, 0, 1, 5, 15, 35});
  }
}
