package irvine.oeis.a013;

import irvine.oeis.gf.GfSequence;

/**
 * A013535 Numerator of the coefficient [x^(2n)] in the Taylor series sec(cosec(x) - cosech(x)).
 * @author Sean A. Irvine
 */
public class A013535 extends GfSequence {

  /** Construct the sequence. */
  public A013535() {
    super(0, 2, "sec((xcsc(x) - xcsch(x))/x)");
  }
}
