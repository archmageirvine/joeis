package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013559 Numerator of [x^n] in the Taylor expansion of exp(cosech(x)-coth(x)).
 * @author Sean A. Irvine
 */
public class A013559 extends GfSequence {

  /** Construct the sequence. */
  public A013559() {
    super(0, "exp((xcsch(x)-xcoth(x))/x)");
  }
}
