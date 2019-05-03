package irvine.oeis.a008;

import irvine.oeis.RatPolyGfSequence;

/**
 * A008583 Molien series for Weyl group <code>E_7</code>.
 * @author Sean A. Irvine
 */
public class A008583 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A008583() {
    super(RING.one(), RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(
      RING.oneMinusXToTheN(1),
      RING.oneMinusXToTheN(3)),
      RING.oneMinusXToTheN(4)),
      RING.oneMinusXToTheN(5)),
      RING.oneMinusXToTheN(6)),
      RING.oneMinusXToTheN(7)),
      RING.oneMinusXToTheN(9)));
  }
}

