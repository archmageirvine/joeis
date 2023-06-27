package irvine.oeis.a249;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A249222 Expansion of x*(1+5*x-5*x^3)/(1-6*x^2+5*x^4).
 * @author Sean A. Irvine
 */
public class A249222 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249222() {
    super(1, new long[] {-5, 0, 6, 0}, new long[] {1, 5, 6, 25});
  }
}
