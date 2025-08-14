package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012857 Numerator of [x^(2n)] of the Taylor expansion log(cosec(x)*arctan(x))= -x^2/6 +3*x^4/20 -50*x^6/567 +203*x^8/3240 -7472*x^10/155925 +...
 * @author Sean A. Irvine
 */
public class A012857 extends GfSequence {

  /** Construct the sequence. */
  public A012857() {
    super(0, 2, "log(xcsc(x)*atan(x)/x)");
  }
}
