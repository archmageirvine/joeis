package irvine.oeis.a202;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A202379 Denominators of coefficients in Taylor series expansion of log(cosec(x)*log(x+1)).
 * @author Sean A. Irvine
 */
public class A202379 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A202379() {
    super(0, "log(xcsc(x)*log(x+1)/x)");
  }
}
