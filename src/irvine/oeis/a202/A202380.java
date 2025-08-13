package irvine.oeis.a202;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A202380 Denominators of coefficients in Taylor series expansion of log(cosec(x)*arcsin(x)).
 * @author Sean A. Irvine
 */
public class A202380 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A202380() {
    super(0, 2, "log(xcsc(x)*asin(x)/x)");
  }
}
