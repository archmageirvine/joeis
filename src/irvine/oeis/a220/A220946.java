package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220946 Expansion of <code>(1+2*x+2*x^2-x^3)/((1-x)*(1+x)*(1-3x^2))</code>.
 * @author Sean A. Irvine
 */
public class A220946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220946() {
    super(new long[] {-3, 0, 4, 0}, new long[] {1, 2, 6, 7});
  }
}
