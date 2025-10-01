package irvine.oeis.a202;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A202602 Denominator of the coefficient of [x^(2n)] of the Taylor series log(cosec(x)*arctanh(x)).
 * @author Sean A. Irvine
 */
public class A202602 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A202602() {
    super(1, 2, "log(xcsc(x)*atanh(x)/x)");
  }
}
