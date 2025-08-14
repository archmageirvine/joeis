package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012859 Numerator of the coefficient of [x^(2n)] of the Taylor series log(cosec(x)*arcsinh(x))= x^4/15 -x^6/30 +25*x^8/1134 -269*x^10/17010 +4401359*x^12/364864500-...
 * @author Sean A. Irvine
 */
public class A012859 extends GfSequence {

  /** Construct the sequence. */
  public A012859() {
    super(2, 2, "log(xcsc(x)*asinh(x)/x)");
  }
}
