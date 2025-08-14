package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013531 Numerator of [x^(2n+1)] in the Taylor expansion arcsin(cosec(x) - cosech(x)) = x/3 + x^3/162 + 5*x^5/1134 + 19*x^7/76545 + 13793*x^9/218245104 + ...
 * @author Sean A. Irvine
 */
public class A013531 extends GfSequence {

  /** Construct the sequence. */
  public A013531() {
    super(0, 2, "asin((xcsc(x) - xcsch(x))/x)/x");
  }
}
