package irvine.oeis.a234;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A234041 a(n) = binomial(n+2,2)*gcd(n,3)/3, n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A234041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234041() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {1, 1, 2, 10, 5, 7, 28, 12, 15});
  }
}
