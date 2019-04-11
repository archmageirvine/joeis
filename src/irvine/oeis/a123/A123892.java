package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123892 G.f.: <code>-(1+x^2)*(1+2*x^2)/(-1-3*x^2-2*x^4+3*x+6*x^3+2*x^5)</code>.
 * @author Sean A. Irvine
 */
public class A123892 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123892() {
    super(new long[] {2, -2, 6, -3, 3}, new long[] {1, 3, 9, 24, 63});
  }
}
