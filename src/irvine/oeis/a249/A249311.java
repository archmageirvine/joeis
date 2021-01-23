package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249311 Expansion of x*(1+9*x-8*x^3)/(1-10*x^2+8*x^4).
 * @author Sean A. Irvine
 */
public class A249311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249311() {
    super(new long[] {-8, 0, 10, 0}, new long[] {1, 9, 10, 82});
  }
}
