package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099583 <code>a(n) =</code> Sum_{k=0..floor(n/2)} <code>binomial(n-k, k-1)*2^(n-k-1)*(3/2)^(k-1)</code>.
 * @author Sean A. Irvine
 */
public class A099583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099583() {
    super(new long[] {-9, -6, 6, 2}, new long[] {0, 0, 1, 2});
  }
}
