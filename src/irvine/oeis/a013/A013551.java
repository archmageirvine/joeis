package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013551 Numerator of [x^n] in the Taylor expansion exp(cot(x)-coth(x))= 1-2*x/3 +2x^2/9 -4*x^3/81 +2*x^4/243 -136*x^5/25515 +676*x^6/229635 -...
 * @author Sean A. Irvine
 */
public class A013551 extends GfSequence {

  /** Construct the sequence. */
  public A013551() {
    super(0, "exp((xcot(x)-xcoth(x))/x)");
  }
}
