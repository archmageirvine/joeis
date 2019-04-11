package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123947 Expansion of <code>x^2*(1+x-x^2)/(1-2*x-4*x^2+x^3+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A123947 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123947() {
    super(new long[] {-1, -1, 4, 2}, new long[] {0, 1, 3, 9});
  }
}
