package irvine.oeis.a204;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A204419 y-values in the solutions to x^2 - 313*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A204419 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204419() {
    super(1, new long[] {-1, 64376241658269698L}, new long[] {0, 1819380158564160L});
  }
}
