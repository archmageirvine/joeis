package irvine.oeis.a008;

import irvine.oeis.RatPolyGfSequence;

/**
 * A008622 Expansion of <code>1/((1-x^4)*(1-x^6)*(1-x^7))</code>.
 * @author Sean A. Irvine
 */
public class A008622 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A008622() {
    super(RING.one(), RING.multiply(RING.multiply(RING.oneMinusXToTheN(4), RING.oneMinusXToTheN(6)), RING.oneMinusXToTheN(7)));
  }
}
