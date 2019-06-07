package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248699 Expansion of <code>(2 + x + 5*x^2 + 3*x^3 + 3*x^4 + x^5) / ((1 - x^3) * (1 - x^4))</code> in powers of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A248699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248699() {
    super(new long[] {-1, 0, 0, 1, 1, 0, 0}, new long[] {2, 1, 5, 5, 6, 7, 10});
  }
}
