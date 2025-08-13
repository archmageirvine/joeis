package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012854 Numerators of coefficients in Taylor series expansion of log(cosec(x)*log(x+1)).
 * @author Sean A. Irvine
 */
public class A012854 extends GfSequence {

  /** Construct the sequence. */
  public A012854() {
    super(0, "log(xcsc(x)*log(x+1)/x)");
  }
}
