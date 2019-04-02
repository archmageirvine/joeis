package irvine.oeis.a272;

import irvine.oeis.LinearRecurrence;

/**
 * A272549 Expansion of x*(1 + 5*x - 3*x^2 + 7*x^3 + 3*x^4 + 3 *x^5 - x^6 + x^7)/((1 - x)^3*(1 + x + x^2 + x^3)^2).
 * @author Sean A. Irvine
 */
public class A272549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A272549() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {0, 1, 6, 3, 10, 15, 28, 21, 36});
  }
}
