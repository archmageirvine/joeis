package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013308 Numerator of [x^n] of the Taylor series arccosh(exp(x)-arctan(x)).
 * @author Sean A. Irvine
 */
public class A013308 extends GfSequence {

  /** Construct the sequence. */
  public A013308() {
    super(1, "acosh(exp(x) - atan(x))");
  }
}
