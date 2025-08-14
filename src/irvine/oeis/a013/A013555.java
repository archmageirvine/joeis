package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013555 Numerator of [x^(2n+1)] of the Taylor series arctan(cot(x)-coth(x))= -2*x/3 +8*x^3/81 -52*x^5/1701 +112*x^7/10935 -51412*x^9/13640319+...
 * @author Sean A. Irvine
 */
public class A013555 extends GfSequence {

  /** Construct the sequence. */
  public A013555() {
    super(0, 2, "atan((xcot(x)-xcoth(x))/x)/x");
  }
}
