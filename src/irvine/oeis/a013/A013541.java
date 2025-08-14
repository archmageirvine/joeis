package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013541 Numerator of the coefficient [x^(2n)] of the Taylor series cos(cosec(x) - coth(x)).
 * @author Sean A. Irvine
 */
public class A013541 extends GfSequence {

  /** Construct the sequence. */
  public A013541() {
    super(0, 2, "cos((xcsc(x) - xcoth(x))/x)");
  }
}
