package irvine.oeis.a008;

import irvine.oeis.RatPolyGfSequence;

/**
 * A008584 Molien series for Weyl group <code>E_6</code>.
 * @author Sean A. Irvine
 */
public class A008584 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A008584() {
    super(RING.one(), RING.multiply(RING.multiply(RING.multiply(RING.multiply(RING.multiply(
      RING.oneMinusXToTheN(2),
      RING.oneMinusXToTheN(5)),
      RING.oneMinusXToTheN(6)),
      RING.oneMinusXToTheN(8)),
      RING.oneMinusXToTheN(9)),
      RING.oneMinusXToTheN(12)));
  }
}

