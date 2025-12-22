package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108486 a(n) = Sum_{k=0..floor(n/2)} binomial(2n-2k,2k)3^k*2^(n-k).
 * @author Sean A. Irvine
 */
public class A108486 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108486() {
    super(new long[] {-36, 24, 8, 4}, new long[] {1, 2, 10, 80});
  }
}
