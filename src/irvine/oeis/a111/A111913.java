package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111913 Expansion of <code>x*(-2-3*x-x^2+x^7+x^8+2*x^4)/((x-1)*(x+1)*(x^8-x^4+1))</code>.
 * @author Sean A. Irvine
 */
public class A111913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111913() {
    super(new long[] {1, 0, -1, 0, -1, 0, 1, 0, 1, 0}, new long[] {0, 2, 3, 3, 3, 3, 6, 4, 5, 1});
  }
}
