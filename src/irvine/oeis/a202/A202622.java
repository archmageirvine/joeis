package irvine.oeis.a202;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A202622 Denominators of coefficients in Taylor series expansion of log(cotan(x)*arcsinh(x)) (even powers only).
 * @author Sean A. Irvine
 */
public class A202622 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A202622() {
    super(0, 2, "log(xcot(x)*asinh(x)/x)");
  }
}
