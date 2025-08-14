package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013536 Numerators of coefficients in Taylor series expansion of exp(cosec(x)-cotanh(x)).
 * @author Sean A. Irvine
 */
public class A013536 extends GfSequence {

  /** Construct the sequence. */
  public A013536() {
    super(0, "exp((xcsc(x) - xcoth(x))/x)");
  }
}
