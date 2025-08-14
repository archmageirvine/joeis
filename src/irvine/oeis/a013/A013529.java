package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013529 Numerator of [x^n] in the Taylor expansion exp(cosec(x) - cosech(x)) = 1 + x/3 + x^2/18 + x^3/162 + x^4/1944 + 211*x^5/51030 + ...
 * @author Sean A. Irvine
 */
public class A013529 extends GfSequence {

  /** Construct the sequence. */
  public A013529() {
    super(0, "exp((xcsc(x) - xcsch(x))/x)");
  }
}
