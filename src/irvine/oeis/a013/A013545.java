package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013545 Numerator of the coefficient [x^(2n+1)] of the Taylor series arctanh(cosec(x) - coth(x)).
 * @author Sean A. Irvine
 */
public class A013545 extends GfSequence {

  /** Construct the sequence. */
  public A013545() {
    super(0, 2, "atanh((xcsc(x) - xcoth(x))/x)/x");
  }
}
