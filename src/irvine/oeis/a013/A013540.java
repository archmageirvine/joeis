package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013540 Numerator of the coefficient [x^(2n+1)] of the Taylor series arctan(cosec(x) - coth(x)).
 * @author Sean A. Irvine
 */
public class A013540 extends GfSequence {

  /** Construct the sequence. */
  public A013540() {
    super(0, 2, "atan((xcsc(x) - xcoth(x))/x)/x");
  }
}
