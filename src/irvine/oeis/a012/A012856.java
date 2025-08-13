package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012856 Numerators of coefficients in Taylor series expansion of log(cosec(x)*arcsin(x)).
 * @author Sean A. Irvine
 */
public class A012856 extends GfSequence {

  /** Construct the sequence. */
  public A012856() {
    super(0, 2, "log(xcsc(x)*asin(x)/x)");
  }
}
