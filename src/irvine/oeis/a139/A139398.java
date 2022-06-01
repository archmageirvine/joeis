package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139398 a(n) = Sum_{k &gt;= 0} binomial(n,5*k).
 * @author Sean A. Irvine
 */
public class A139398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139398() {
    super(new long[] {2, -5, 10, -10, 5}, new long[] {1, 1, 1, 1, 1});
  }
}
