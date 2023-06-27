package irvine.oeis.a201;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A201157 y-values in the solution to 5*x^2 - 20 = y^2.
 * @author Sean A. Irvine
 */
public class A201157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201157() {
    super(1, new long[] {-1, 3}, new long[] {0, 5});
  }
}
