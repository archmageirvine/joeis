package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099582 a(n) = Sum_{k=0..floor(n/2)} binomial(n-k, k-1)*4^(n-k-1).
 * @author Sean A. Irvine
 */
public class A099582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099582() {
    super(new long[] {-16, -16, 8, 4}, new long[] {0, 0, 1, 4});
  }
}
