package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013547 Numerator of the coefficient [x^(2n)] of the Taylor expansion sec(cosec(x)-coth(x))= 1+x^2/72 -211*x^4/31104 +169339*x^6/235146240 -205787*x^8/13544423424+...
 * @author Sean A. Irvine
 */
public class A013547 extends GfSequence {

  /** Construct the sequence. */
  public A013547() {
    super(0, 2, "sec((xcsc(x) - xcoth(x))/x)");
  }
}
