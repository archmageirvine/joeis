package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013538 Numerator of [x^(2*n + 1)] in the Taylor series expansion of arcsin(cosec(x) - cotanh(x)).
 * @author Sean A. Irvine
 */
public class A013538 extends GfSequence {

  /** Construct the sequence. */
  public A013538() {
    super(0, 2, "asin((xcsc(x) - xcoth(x))/x)/x");
  }
}
