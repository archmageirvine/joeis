package irvine.oeis.a250;

import irvine.oeis.LinearRecurrence;

/**
 * A250304 Four-column array read by rows: T(n,k) = the coefficient of x^k in the expanded polynomial <code>x^3 + (x+1)^3 + </code>... <code>+ (x+n-1)^3,</code> for <code>0 &lt;=</code> k <code>&lt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A250304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A250304() {
    super(new long[] {1, 0, 0, 0, -5, 0, 0, 0, 10, 0, 0, 0, -10, 0, 0, 0, 5, 0, 0, 0}, new long[] {0, 0, 0, 1, 1, 3, 3, 2, 9, 15, 9, 3, 36, 42, 18, 4, 100, 90, 30, 5});
  }
}
