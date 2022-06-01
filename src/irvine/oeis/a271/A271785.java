package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271785 a(n) = Sum_{k=0..(n-1)/2} (n+2-k)*binomial(n-1-k,k).
 * @author Sean A. Irvine
 */
public class A271785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271785() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 3, 4, 9});
  }
}
