package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061279 <code>a(n) =</code> Sum_{k <code>&gt;= 0} 2^k *</code> binomial(k+2,n-2*k).
 * @author Sean A. Irvine
 */
public class A061279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061279() {
    super(new long[] {2, 2, 0}, new long[] {1, 2, 3});
  }
}
