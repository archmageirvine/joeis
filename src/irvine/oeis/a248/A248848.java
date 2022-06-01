package irvine.oeis.a248;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A248848 Norm of coefficients in the expansion of 1/(1 - 3*x - I*x^2), where I^2=-1.
 * @author Sean A. Irvine
 */
public class A248848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248848() {
    super(new long[] {-1, 9, 2, 9}, new long[] {1, 9, 82, 765});
  }
}
