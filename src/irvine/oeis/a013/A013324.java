package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013324 Numerator of [x^n] of the Taylor series arccosh(exp(x)-tanh(x)).
 * @author Sean A. Irvine
 */
public class A013324 extends GfSequence {

  /** Construct the sequence. */
  public A013324() {
    super(1, "acosh(exp(x) - tanh(x))");
  }
}
