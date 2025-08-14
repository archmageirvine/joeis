package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012860 Numerators of coefficients in Taylor series expansion of  log(cosec(x)*tanh(x)).
 * @author Sean A. Irvine
 */
public class A012860 extends GfSequence {

  /** Construct the sequence. */
  public A012860() {
    super(0, 2, "log(xcsc(x)*tanh(x)/x)");
  }
}
