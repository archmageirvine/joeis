package irvine.oeis.a008;

import irvine.oeis.RatPolyGfSequence;

/**
 * A008618 Expansion of <code>1/((1-x^2)(1-x^9))</code>.
 * @author Sean A. Irvine
 */
public class A008618 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A008618() {
    super(RING.one(), RING.multiply(RING.oneMinusXToTheN(2), RING.oneMinusXToTheN(9)));
  }
}
