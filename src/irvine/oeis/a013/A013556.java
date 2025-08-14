package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013556 Numerator of [x^(2n)] of the Taylor series cos(cot(x)-coth(x))= 1 -2*x^2/9 +2*x^4/243 -676*x^6/229635 +62*x^8/295245 -...
 * @author Sean A. Irvine
 */
public class A013556 extends GfSequence {

  /** Construct the sequence. */
  public A013556() {
    super(0, 2, "cos((xcot(x)-xcoth(x))/x)");
  }
}
