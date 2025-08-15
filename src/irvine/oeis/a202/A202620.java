package irvine.oeis.a202;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A202620 Denominators of coefficients in Taylor series expansion of log(cotan(x)*arcsin(x)).
 * @author Sean A. Irvine
 */
public class A202620 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A202620() {
    super(0, 2, "log(xcot(x)*asin(x)/x)");
  }
}
