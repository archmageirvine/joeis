package irvine.oeis.a249;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A249221 Expansion of x*(1+5*x-2*x^3)/(1-6*x^2+2*x^4).
 * @author Sean A. Irvine
 */
public class A249221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249221() {
    super(1, new long[] {-2, 0, 6, 0}, new long[] {1, 5, 6, 28});
  }
}
