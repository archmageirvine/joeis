package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013534 Numerator of [x^(2n)] in the Taylor expansion cos(cosec(x) - cosech(x)).
 * @author Sean A. Irvine
 */
public class A013534 extends GfSequence {

  /** Construct the sequence. */
  public A013534() {
    super(0, 2, "cos((xcsc(x) - xcsch(x))/x)");
  }
}
