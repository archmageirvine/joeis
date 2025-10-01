package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012869 Numerator of [x^(2n+1)] in the Taylor series arccos(cot(x)*arcsinh(x)).
 * @author Sean A. Irvine
 */
public class A012869 extends GfSequence {

  /** Construct the sequence. */
  public A012869() {
    super(0, 2, "asin(sqrt(1-((xcot(x)*asinh(x))/x)^2))/x");
  }
}
