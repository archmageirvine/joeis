package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248699 Expansion of (2 + x + 5*x^2 + 3*x^3 + 3*x^4 + x^5) / ((1 - x^3) * (1 - x^4)) in powers of x.
 * @author Sean A. Irvine
 */
public class A248699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248699() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 0}, new long[] {2, 1, 5, 5, 6, 7, 10});
  }
}
