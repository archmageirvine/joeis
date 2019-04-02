package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249310 Expansion of x*(1+7*x-6*x^3)/(1-8*x^2+6*x^4).
 * @author Sean A. Irvine
 */
public class A249310 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249310() {
    super(new long[] {-6, 0, 8, 0}, new long[] {1, 7, 8, 50});
  }
}
