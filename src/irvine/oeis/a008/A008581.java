package irvine.oeis.a008;

import irvine.oeis.RatPolyGfSequence;

/**
 * A008581 Molien series for 6-dimensional complex reflection group 4.U_4 <code>(3)</code> of order <code>2^9 .3^7 .5.7</code>.
 * @author Sean A. Irvine
 */
public class A008581 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A008581() {
    super(RING.one(), RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(
      RING.oneMinusXToTheN(1),
      RING.oneMinusXToTheN(2)),
      RING.oneMinusXToTheN(3)),
      RING.oneMinusXToTheN(4)),
      RING.oneMinusXToTheN(5)),
      RING.oneMinusXToTheN(7)));
  }
}
