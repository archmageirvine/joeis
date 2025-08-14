package irvine.oeis.a202;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A202383 Denominators of coefficients in Taylor series expansion of log(cosec(x)*tanh(x)).
 * @author Sean A. Irvine
 */
public class A202383 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A202383() {
    super(0, 2, "log(xcsc(x)*tanh(x)/x)");
  }
}
