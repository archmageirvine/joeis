package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013323 Numerator of [x^n] in the Taylor series arccosh(exp(x)-arcsinh(x))= x+x^2/3 -x^3/18 -14*x^4/135 +47*x^5/3240 +3527*x^6/68040 -4787*x^7/680400-...
 * @author Sean A. Irvine
 */
public class A013323 extends GfSequence {

  /** Construct the sequence. */
  public A013323() {
    super(1, "acosh(exp(x) - asinh(x))");
  }
}
