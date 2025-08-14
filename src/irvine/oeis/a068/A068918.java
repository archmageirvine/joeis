package irvine.oeis.a068;

import irvine.oeis.gf.DenominatorGfSequence;

/**
 * A068918 Denominators of coefficients in 1/sin(x) - 1/sinh(x) power series.
 * @author Sean A. Irvine
 */
public class A068918 extends DenominatorGfSequence {

  /** Construct the sequence. */
  public A068918() {
    super(0, 4, "(xcsc(x)-xcsch(x))/x^2");
  }
}

