package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013539 Numerator of the coefficient [x^(2n+1)] of the Taylor series tan(cosec(x)-coth(x)).
 * @author Sean A. Irvine
 */
public class A013539 extends GfSequence {

  /** Construct the sequence. */
  public A013539() {
    super(0, 2, "tan((xcsc(x) - xcoth(x))/x)/x");
  }
}
