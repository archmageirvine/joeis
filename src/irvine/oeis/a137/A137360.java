package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137360 a(n) = Sum_{k &lt;= n/2 } k*binomial(n-2k, 3k+1).
 * @author Sean A. Irvine
 */
public class A137360 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137360() {
    super(new long[] {-1, 0, -2, 6, -7, 8, -15, 20, -15, 6}, new long[] {0, 0, 0, 0, 0, 0, 1, 5, 15, 35});
  }
}
