package irvine.oeis.a061;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A061279 a(n) = Sum_{k &gt;= 0} 2^k * binomial(k+2,n-2*k).
 * @author Sean A. Irvine
 */
public class A061279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061279() {
    super(new long[] {2, 2, 0}, new long[] {1, 2, 3});
  }
}
