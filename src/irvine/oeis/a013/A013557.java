package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013557 Numerator of [x^(2n)] of the Taylor series sec(cot(x)-coth(x))= 1 +2*x^2/9 +10*x^4/243 +2356*x^6/229635 +986*x^8/413343+...
 * @author Sean A. Irvine
 */
public class A013557 extends GfSequence {

  /** Construct the sequence. */
  public A013557() {
    super(0, 2, "sec((xcot(x)-xcoth(x))/x)");
  }
}
