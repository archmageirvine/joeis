package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139748 <code>a(n) =</code> Sum_{ <code>k &gt;= 0}</code> binomial(n,5*k+3).
 * @author Sean A. Irvine
 */
public class A139748 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139748() {
    super(new long[] {2, -5, 10, -10, 5}, new long[] {0, 0, 0, 1, 4});
  }
}
