package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013543 Numerator of the coefficient [x^(2n+1)] of the Taylor series arcsinh(cosec(x) - coth(x)).
 * @author Sean A. Irvine
 */
public class A013543 extends GfSequence {

  /** Construct the sequence. */
  public A013543() {
    super(0, 2, "asinh((xcsc(x) - xcoth(x))/x)/x");
  }
}
