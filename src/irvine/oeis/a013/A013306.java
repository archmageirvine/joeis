package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013306 Numerator of [x^n] of the Taylor series arccosh(exp(x) - arcsin(x)).
 * @author Sean A. Irvine
 */
public class A013306 extends GfSequence {

  /** Construct the sequence. */
  public A013306() {
    super(1, "acosh(exp(x) - asin(x))");
  }
}
