package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013542 Numerator of the coefficient [x^(2n+1)] of the Taylor series sinh(cosec(x) - coth(x)).
 * @author Sean A. Irvine
 */
public class A013542 extends GfSequence {

  /** Construct the sequence. */
  public A013542() {
    super(0, 2, "sinh((xcsc(x) - xcoth(x))/x)/x");
  }
}
