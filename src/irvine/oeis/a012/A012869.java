package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012869 Numerator of [x^(2n+1)] in the Taylor series arccos(cot(x)*arcsinh(x))= x-x^3/15 +4*x^5/75 -2098*x^7/70875 +2969*x^9/141750 -35380322*x^11/2280403125 +...
 * @author Sean A. Irvine
 */
public class A012869 extends GfSequence {

  /** Construct the sequence. */
  public A012869() {
    super(0, 2, "asin(sqrt(1-((xcot(x)*asinh(x))/x)^2))/x");
  }
}
