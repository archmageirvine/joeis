package irvine.oeis.a202;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A202384 Denominators of coefficients in Taylor series expansion of arccosh(cosec(x)*arctanh(x)).
 * @author Sean A. Irvine
 */
public class A202384 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A202384() {
    super(0, 2, "acosh(xcsc(x)*atanh(x)/x)/x");
  }
}
