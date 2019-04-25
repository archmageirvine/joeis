package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174776 y-values in the solution to <code> x^2 - 39*y^2 = 1</code>.
 * @author Sean A. Irvine
 */
public class A174776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174776() {
    super(new long[] {-1, 50}, new long[] {0, 4});
  }
}
