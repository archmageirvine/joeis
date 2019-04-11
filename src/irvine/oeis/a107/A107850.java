package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107850 G.f. <code>(x^2+x+1)*(2*x^2+2*x+1)*(x-1)^2/((1-x^2-2*x^3)*(x^4+1))</code>.
 * @author Sean A. Irvine
 */
public class A107850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107850() {
    super(new long[] {2, 1, 0, -1, 2, 1, 0}, new long[] {1, 1, 1, 0, 1, 1, 3});
  }
}
