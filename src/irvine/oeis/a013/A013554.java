package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013554 Numerator of [x^(2n+1)] in the Taylor expansion -tan(cot(x)-coth(x))= 2*x/3 +8*x^3/81 +556*x^5/25515 +496*x^7/98415 +717572*x^9/613814355 +...
 * @author Sean A. Irvine
 */
public class A013554 extends GfSequence {

  /** Construct the sequence. */
  public A013554() {
    super(0, 2, "tan((xcoth(x)-xcot(x))/x)/x");
  }
}
