package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274032 Sum of n-th powers of the roots of x^3 + 9*x^2 - x - 1.
 * @author Sean A. Irvine
 */
public class A274032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274032() {
    super(new long[] {1, 1, -9}, new long[] {3, -9, 83});
  }
}
