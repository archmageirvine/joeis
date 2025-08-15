package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012867 Numerators of coefficients in Taylor series expansion of log(cotan(x)*arctan(x)).
 * @author Sean A. Irvine
 */
public class A012867 extends GfSequence {

  /** Construct the sequence. */
  public A012867() {
    super(0, 2, "log(xcot(x)*atan(x)/x)");
  }
}
