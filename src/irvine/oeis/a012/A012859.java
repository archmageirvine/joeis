package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012859 Numerator of the coefficient of [x^(2n)] of the Taylor series log(cosec(x)*arcsinh(x)).
 * @author Sean A. Irvine
 */
public class A012859 extends GfSequence {

  /** Construct the sequence. */
  public A012859() {
    super(2, 2, "log(xcsc(x)*asinh(x)/x)");
  }
}
