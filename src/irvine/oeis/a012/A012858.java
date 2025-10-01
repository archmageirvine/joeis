package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012858 Numerator of [x^(4n+2)] in the Taylor series log(cosec(x)*sinh(x)).
 * @author Sean A. Irvine
 */
public class A012858 extends GfSequence {

  /** Construct the sequence. */
  public A012858() {
    super(0, 4, "log(xcsc(x)*sinh(x)/x)/x^2");
  }
}
