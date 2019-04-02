package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111385 a(n) = binomial(n,4) - binomial(floor(n/2),4) - binomial(ceiling(n/2),4).
 * @author Sean A. Irvine
 */
public class A111385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111385() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 0, 0, 0, 1, 5, 15, 34});
  }
}
