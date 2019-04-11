package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107851 G.f. <code>x*(-1-x-3*x^2-x^3+2*x^5)/((2*x^3+x^2-1)*(x^4+1))</code>.
 * @author Sean A. Irvine
 */
public class A107851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107851() {
    super(new long[] {2, 1, 0, -1, 2, 1, 0}, new long[] {0, 1, 1, 4, 4, 5, 9});
  }
}
