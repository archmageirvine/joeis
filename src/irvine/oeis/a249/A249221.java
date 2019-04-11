package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249221 Expansion of <code>x*(1+5*x-2*x^3)/(1-6*x^2+2*x^4)</code>.
 * @author Sean A. Irvine
 */
public class A249221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249221() {
    super(new long[] {-2, 0, 6, 0}, new long[] {1, 5, 6, 28});
  }
}
