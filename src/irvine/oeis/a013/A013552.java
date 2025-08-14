package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013552 Numerator of [x^(2n+1)] of the Taylor series sin(cot(x)-coth(x)).
 * @author Sean A. Irvine
 */
public class A013552 extends GfSequence {

  /** Construct the sequence. */
  public A013552() {
    super(0, 2, "sin((xcot(x)-xcoth(x))/x)/x");
  }
}
