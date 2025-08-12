package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013308 Numerator of [x^n] of the Taylor series arccosh(exp(x)-arctan(x))= x+x^2/2 -x^3/8 -17*x^4/80 +109*x^5/1920 +299*x^6/2304 -813*x^7/25600 -...
 * @author Sean A. Irvine
 */
public class A013308 extends GfSequence {

  /** Construct the sequence. */
  public A013308() {
    super(1, "acosh(exp(x) - atan(x))");
  }
}
