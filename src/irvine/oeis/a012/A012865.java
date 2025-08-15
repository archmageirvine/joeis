package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012865 Numerators of coefficients in Taylor series expansion of log(cotan(x)*arcsin(x)).
 * @author Sean A. Irvine
 */
public class A012865 extends GfSequence {

  /** Construct the sequence. */
  public A012865() {
    super(0, 2, "log(xcot(x)*asin(x)/x)");
  }
}
