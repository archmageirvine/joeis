package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201837 G.f.: real part of 1/(1 - i*x - i*x^2) where i=sqrt(-1).
 * @author Sean A. Irvine
 */
public class A201837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201837() {
    super(new long[] {-1, -2, -1, 0}, new long[] {1, 0, -1, -2});
  }
}
