package irvine.oeis.a012;

import irvine.oeis.gf.GfSequence;

/**
 * A012871 Numerator of [x^(2n)] in the Taylor expansion log(cot(x)*arctanh(x)).
 * @author Sean A. Irvine
 */
public class A012871 extends GfSequence {

  /** Construct the sequence. */
  public A012871() {
    super(2, 2, "log(xcot(x)*atanh(x)/x)");
  }
}
