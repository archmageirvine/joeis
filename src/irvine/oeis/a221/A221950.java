package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221950 G.f.: 1/(1 - x - x^2 - 2*x^3 - 3*x^4 - 2*x^5 - x^6).
 * @author Sean A. Irvine
 */
public class A221950 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221950() {
    super(new long[] {1, 2, 3, 2, 1, 1}, new long[] {1, 1, 2, 5, 12, 26});
  }
}
