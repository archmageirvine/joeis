package irvine.oeis.a176;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A176758 a(n) = Sum_{k=0..floor((n-1)/2)} (3^k-1)*binomial(n, 2*k+1).
 * @author Sean A. Irvine
 */
public class A176758 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176758() {
    super(3, new long[] {-4, -2, 4}, new long[] {2, 8, 28});
  }
}
