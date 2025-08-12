package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013325 Numerator of [x^n] in the Taylor series arccosh(exp(x)-arctanh(x))= x-x^2/6-x^3/72 -359*x^4/2160 -1681*x^5/51840 -52981*x^6/435456 -...
 * @author Sean A. Irvine
 */
public class A013325 extends GfSequence {

  /** Construct the sequence. */
  public A013325() {
    super(1, "acosh(exp(x) - atanh(x))");
  }
}
