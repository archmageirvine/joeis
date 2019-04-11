package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101822 Expansion of <code>1/(1-x-2*x^2-3*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A101822 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101822() {
    super(new long[] {3, 2, 1}, new long[] {1, 1, 3});
  }
}
