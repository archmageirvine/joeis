package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013550 Numerator of the coefficient of [x^n] in the Taylor expansion exp(cot(x) - cosech(x)).
 * @author Sean A. Irvine
 */
public class A013550 extends GfSequence {

  /** Construct the sequence. */
  public A013550() {
    super(0, "exp((xcot(x) - xcsch(x))/x)");
  }
}
