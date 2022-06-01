package irvine.oeis.a201;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A201838 G.f.: imaginary part of 1/(1 - i*x - i*x^2) where i=sqrt(-1).
 * @author Sean A. Irvine
 */
public class A201838 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201838() {
    super(new long[] {-1, -2, -1, 0}, new long[] {0, 1, 1, -1});
  }
}
