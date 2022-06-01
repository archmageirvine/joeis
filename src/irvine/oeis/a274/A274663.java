package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274663 Sum of n-th powers of the roots of x^3 + 4*x^2 - 11*x - 1.
 * @author Sean A. Irvine
 */
public class A274663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274663() {
    super(new long[] {1, 11, -4}, new long[] {3, -4, 38});
  }
}
