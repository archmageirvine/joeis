package irvine.oeis.a175;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A175671 Denominator of [x^(2n)] of the Taylor expansion log(cosec(x)*arctan(x)).
 * @author Sean A. Irvine
 */
public class A175671 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A175671() {
    super(0, 2, "log(xcsc(x)*atan(x)/x)");
  }
}
