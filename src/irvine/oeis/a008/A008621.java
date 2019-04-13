package irvine.oeis.a008;

import irvine.oeis.RatPolyGfSequence;

/**
 * A008621 Expansion of <code>1/((1-x)*(1-x^4))</code>.
 * @author Sean A. Irvine
 */
public class A008621 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A008621() {
    super(RING.one(), RING.multiply(RING.oneMinusXToTheN(1), RING.oneMinusXToTheN(4)));
  }
}
