package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013553 Numerator of [x^(2n+1)] of the Taylor expansion -arcsin(cot(x)-coth(x)).
 * @author Sean A. Irvine
 */
public class A013553 extends GfSequence {

  /** Construct the sequence. */
  public A013553() {
    super(0, 2, "asin((xcoth(x)-xcot(x))/x)/x");
  }
}
