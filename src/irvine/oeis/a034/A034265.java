package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034265 a(n) = binomial(n+6,6)*(6*n+7)/7.
 * @author Sean A. Irvine
 */
public class A034265 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034265() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 13, 76, 300, 930, 2442, 5676, 12012});
  }
}
