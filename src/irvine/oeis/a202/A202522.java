package irvine.oeis.a202;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A202522 Denominator of the coefficient of [x^(2n)] of the Taylor series log(cosec(x)*arcsinh(x)).
 * @author Sean A. Irvine
 */
public class A202522 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A202522() {
    super(2, 2, "log(xcsc(x)*asinh(x)/x)");
  }
}
