package irvine.oeis.a202;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A202602 Denominator of the coefficient of [x^(2n)] of the Taylor series log(cosec(x)*arctanh(x))= x^2/2 +3*x^4/20 +4*x^6/45 +203*x^8/3240 +2038*x^10/42525 +...
 * @author Sean A. Irvine
 */
public class A202602 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A202602() {
    super(1, 2, "log(xcsc(x)*atanh(x)/x)");
  }
}
