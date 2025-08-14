package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013544 Numerator of the coefficient [x^(2n+1)] of tanh(cosec(x)-coth(x)).
 * @author Sean A. Irvine
 */
public class A013544 extends GfSequence {

  /** Construct the sequence. */
  public A013544() {
    super(0, 2, "tanh((xcsc(x) - xcoth(x))/x)/x");
  }
}
