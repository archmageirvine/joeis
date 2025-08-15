package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012870 Numerator of [x^(4n+2)] in the Taylor series -log(cot(x)*tanh(x))= 2*x^2/3 +124*x^6/2835 +292*x^10/66825 +65528*x^14/127702575 -...
 * @author Sean A. Irvine
 */
public class A012870 extends GfSequence {

  /** Construct the sequence. */
  public A012870() {
    super(0, 4, "-log(xcot(x)*tanh(x)/x)/x^2");
  }
}
