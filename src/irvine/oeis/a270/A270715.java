package irvine.oeis.a270;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A270715 a(n) = ((n+2)/2)*Sum_{k=0..n/2}(Sum_{i=0..n-2*k}(binomial(k+1,n-2*k-i)*binomial(k+i,k))/(k+1).
 * @author Sean A. Irvine
 */
public class A270715 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270715() {
    super(new long[] {-1, 0, 0, 2}, new long[] {1, 3, 5, 10});
  }
}
