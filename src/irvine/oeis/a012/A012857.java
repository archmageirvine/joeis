package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012857 Numerator of [x^(2n)] of the Taylor expansion log(cosec(x)*arctan(x)).
 * @author Sean A. Irvine
 */
public class A012857 extends GfSequence {

  /** Construct the sequence. */
  public A012857() {
    super(0, 2, "log(xcsc(x)*atan(x)/x)");
  }
}
