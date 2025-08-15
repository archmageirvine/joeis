package irvine.oeis.a202;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A202619 Denominators of coefficients in Taylor series expansion of log(cotan(x)*log(x+1)).
 * @author Sean A. Irvine
 */
public class A202619 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A202619() {
    super(0, "log(xcot(x)*log(x+1)/x)");
  }
}
