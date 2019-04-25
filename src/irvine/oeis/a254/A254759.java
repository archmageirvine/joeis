package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254759 Part of the positive proper solutions y of the Pell equation <code>x^2 - 2*y^2 = - 7^2</code> based on the fundamental solution <code>(x0, y0)= (1, 5)</code>.
 * @author Sean A. Irvine
 */
public class A254759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254759() {
    super(new long[] {-1, 6}, new long[] {5, 17});
  }
}
