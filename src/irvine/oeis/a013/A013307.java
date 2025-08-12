package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013307 Numerator of [x^n] in the Taylor series arccosh(exp(x) - tan(x)) = x - x^2/6 - x^3/72 - 43*x^4/432 - 221*x^5/10368 - 89513*x^6/2177280 - ...
 * @author Sean A. Irvine
 */
public class A013307 extends GfSequence {

  /** Construct the sequence. */
  public A013307() {
    super(1, "acosh(exp(x) - tan(x))");
  }
}
