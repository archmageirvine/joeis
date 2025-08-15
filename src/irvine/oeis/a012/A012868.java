package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012868 Numerators of coefficients in Taylor series expansion of log(cotan(x)*arcsinh(x)).
 * @author Sean A. Irvine
 */
public class A012868 extends GfSequence {

  /** Construct the sequence. */
  public A012868() {
    super(0, 2, "log(xcot(x)*asinh(x)/x)");
  }
}
