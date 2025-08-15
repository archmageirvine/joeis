package irvine.oeis.a202;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A202621 Denominators of coefficients in Taylor series expansion of log(cotan(x)*arctan(x)).
 * @author Sean A. Irvine
 */
public class A202621 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A202621() {
    super(0, 2, "log(xcot(x)*atan(x)/x)");
  }
}
