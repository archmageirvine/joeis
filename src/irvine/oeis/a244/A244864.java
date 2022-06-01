package irvine.oeis.a244;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A244864 a(n) = binomial(n+5,5) + 4*binomial(n+4,5) + 4*binomial(n+3,5) + binomial(n+2,5).
 * @author Sean A. Irvine
 */
public class A244864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244864() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 10, 49, 165, 440, 1001});
  }
}
