package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013324 Numerator of [x^n] of the Taylor series arccosh(exp(x)-tanh(x))= x+x^2/2 -x^3/8 -7*x^4/48 +3*x^5/128 +631*x^6/11520 +37*x^7/15360 -12731*x^8/645120 -...
 * @author Sean A. Irvine
 */
public class A013324 extends GfSequence {

  /** Construct the sequence. */
  public A013324() {
    super(1, "acosh(exp(x) - tanh(x))");
  }
}
