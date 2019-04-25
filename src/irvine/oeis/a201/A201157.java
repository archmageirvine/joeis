package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201157 y-values in the solution to <code>5*x^2 - 20 = y^2</code>.
 * @author Sean A. Irvine
 */
public class A201157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201157() {
    super(new long[] {-1, 3}, new long[] {0, 5});
  }
}
