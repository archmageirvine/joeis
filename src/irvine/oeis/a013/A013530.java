package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013530 Numerator of [x^(2n+1)] of the Taylor expansion sin(cosec(x) - cosech(x)) = x/3 - x^3/162 + 211*x^5/51030 -157*x^7/688905 + 439801*x^9/9821029680 - ...
 * @author Sean A. Irvine
 */
public class A013530 extends GfSequence {

  /** Construct the sequence. */
  public A013530() {
    super(0, 2, "sin((xcsc(x) - xcsch(x))/x)/x");
  }
}
