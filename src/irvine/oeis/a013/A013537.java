package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013537 Numerator of [x^(2n+1)] of the Taylor expansion sin(cosec(x)-coth(x)).
 * @author Sean A. Irvine
 */
public class A013537 extends GfSequence {

  /** Construct the sequence. */
  public A013537() {
    super(0, 2, "sin((xcsc(x) - xcoth(x))/x)/x");
  }
}
