package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159582 Expansion of <code>(1+6*x+x^2-2*x^3)/((x^2+2*x-1)*(x^2-2*x-1)),</code> bisection is NSW numbers.
 * @author Sean A. Irvine
 */
public class A159582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159582() {
    super(new long[] {-1, 0, 6, 0}, new long[] {1, 6, 7, 34});
  }
}
