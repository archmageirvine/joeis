package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013323 Numerator of [x^n] in the Taylor series arccosh(exp(x)-arcsinh(x)).
 * @author Sean A. Irvine
 */
public class A013323 extends GfSequence {

  /** Construct the sequence. */
  public A013323() {
    super(1, "acosh(exp(x) - asinh(x))");
  }
}
