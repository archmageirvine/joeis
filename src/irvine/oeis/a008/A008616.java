package irvine.oeis.a008;

import irvine.oeis.RatPolyGfSequence;

/**
 * A008616 Expansion of <code>1/((1-x^2)(1-x^5))</code>.
 * @author Sean A. Irvine
 */
public class A008616 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A008616() {
    super(RING.one(), RING.multiply(RING.oneMinusXToTheN(2), RING.oneMinusXToTheN(5)));
  }
}
