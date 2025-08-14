package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013532 Numerator of [x^(2n+1)] in the Taylor series tan(cosec(x)-cosech(x)) = x/3 +x^3/81 +949*x^5/204120 +2647*x^7/5511240+... .
 * @author Sean A. Irvine
 */
public class A013532 extends GfSequence {

  /** Construct the sequence. */
  public A013532() {
    super(0, 2, "tan((xcsc(x) - xcsch(x))/x)/x");
  }
}
