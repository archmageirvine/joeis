package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099580 a(n) = Sum_{k=0..floor(n/2)} binomial(n-k, k-1) * 4^(k-1).
 * @author Sean A. Irvine
 */
public class A099580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099580() {
    super(new long[] {-16, -4, 8, 1}, new long[] {0, 0, 1, 1});
  }
}
