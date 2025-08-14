package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013533 Numerator of [x^(2n+1)] in the Taylor expansion arctan(cosec(x) - cosech(x)).
 * @author Sean A. Irvine
 */
public class A013533 extends GfSequence {

  /** Construct the sequence. */
  public A013533() {
    super(0, 2, "atan((xcsc(x) - xcsch(x))/x)/x");
  }
}
