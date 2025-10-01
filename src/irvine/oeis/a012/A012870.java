package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012870 Numerator of [x^(4n+2)] in the Taylor series -log(cot(x)*tanh(x)).
 * @author Sean A. Irvine
 */
public class A012870 extends GfSequence {

  /** Construct the sequence. */
  public A012870() {
    super(0, 4, "-log(xcot(x)*tanh(x)/x)/x^2");
  }
}
