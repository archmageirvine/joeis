package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274664 Sum of n-th powers of the roots of x^3 + 11*x^2 - 4*x - 1.
 * @author Georg Fischer
 */
public class A274664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274664() {
    super(0, new long[] {1, 4, -11}, new long[] {3, -11, 129});
  }
}
