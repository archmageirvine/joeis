package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013305 Numerators of coefficients in Taylor series expansion of arccosh(exp(x)-sin(x)).
 * @author Sean A. Irvine
 */
public class A013305 extends GfSequence {

  /** Construct the sequence. */
  public A013305() {
    super(0, "acosh(exp(x)-sin(x))");
  }
}
