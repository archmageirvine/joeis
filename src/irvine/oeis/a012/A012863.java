package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012863 Numerators of coefficients in Taylor series expansion of  log(cotan(x)*log(x+1)).
 * @author Sean A. Irvine
 */
public class A012863 extends GfSequence {

  /** Construct the sequence. */
  public A012863() {
    super(0, "log(xcot(x)*log(x+1)/x)");
  }
}
