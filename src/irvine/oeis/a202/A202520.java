package irvine.oeis.a202;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A202520 Denominator of [x^(4n+2)] in the Taylor series log(cosec(x)*sinh(x)).
 * @author Sean A. Irvine
 */
public class A202520 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A202520() {
    super(0, 4, "log(xcsc(x)*sinh(x)/x)/x^2");
  }
}
