package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274075 Sum of n-th powers of the roots of x^3 + x^2 - 9*x - 1.
 * @author Sean A. Irvine
 */
public class A274075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274075() {
    super(new long[] {1, 9, -1}, new long[] {3, -1, 19});
  }
}
