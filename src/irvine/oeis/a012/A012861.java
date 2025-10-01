package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012861 Numerator of the coefficient of [x^(2n)] of the Taylor series log(cosec(x)*arctanh(x)).
 * @author Sean A. Irvine
 */
public class A012861 extends GfSequence {

  /** Construct the sequence. */
  public A012861() {
    super(1, 2, "log(xcsc(x)*atanh(x)/x)");
  }
}
