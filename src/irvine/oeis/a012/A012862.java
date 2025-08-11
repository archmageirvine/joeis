package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012862 Numerators of coefficients in Taylor series expansion of arccosh(cosec(x)*arctanh(x)).
 * @author Sean A. Irvine
 */
public class A012862 extends GfSequence {

  /** Construct the sequence. */
  public A012862() {
    super(0, 2, "acosh(xcsc(x)*atanh(x)/x)/x");
  }
}
