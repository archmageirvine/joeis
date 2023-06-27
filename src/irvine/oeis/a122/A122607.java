package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122607 Expansion of x*(8*x^5 + 5*x^4 - x^3 - 5*x^2 - 1)/(x^6 + 3*x^5 + 6*x^4 + 4*x^3 - 5*x^2 + x - 1).
 * @author Sean A. Irvine
 */
public class A122607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122607() {
    super(1, new long[] {1, 3, 6, 4, -5, 1}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
