package irvine.oeis.a202;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A202522 Denominator of the coefficient of [x^(2n)] of the Taylor series log(cosec(x)*arcsinh(x))= x^4/15 -x^6/30 +25*x^8/1134 -269*x^10/17010 +4401359*x^12/364864500-...
 * @author Sean A. Irvine
 */
public class A202522 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A202522() {
    super(2, 2, "log(xcsc(x)*asinh(x)/x)");
  }
}
