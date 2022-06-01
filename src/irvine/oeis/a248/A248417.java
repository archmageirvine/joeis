package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248417 Sum of n-th powers of the roots of x^3 +25* x^2 + 31*x - 1.
 * @author Sean A. Irvine
 */
public class A248417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248417() {
    super(new long[] {1, -31, -25}, new long[] {3, -25, 563});
  }
}
