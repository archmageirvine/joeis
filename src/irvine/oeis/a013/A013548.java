package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013548 Numerator of [x^(2n)] of the Taylor series sech(cosec(x)-coth(x))= 1-x^2/72 +221*x^4/31104 +244939*x^6/235146240 +1846213*x^8/13544423424-...
 * @author Sean A. Irvine
 */
public class A013548 extends GfSequence {

  /** Construct the sequence. */
  public A013548() {
    super(0, 2, "sech((xcsc(x) - xcoth(x))/x)");
  }
}
