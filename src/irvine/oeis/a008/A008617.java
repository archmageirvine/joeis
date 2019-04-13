package irvine.oeis.a008;

import irvine.oeis.RatPolyGfSequence;

/**
 * A008617 Expansion of <code>1/((1-x^2)(1-x^7))</code>.
 * @author Sean A. Irvine
 */
public class A008617 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A008617() {
    super(RING.one(), RING.multiply(RING.oneMinusXToTheN(2), RING.oneMinusXToTheN(7)));
  }
}
