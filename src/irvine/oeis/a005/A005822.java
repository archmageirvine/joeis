package irvine.oeis.a005;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A005822 Number of spanning trees in third power of cycle.
 * @author Sean A. Irvine
 */
public class A005822 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A005822() {
    super(RING.multiply(Polynomial.create(1, 1, -1, 1, 1), RING.oneMinusXToTheN(2)),
      Polynomial.create(1, 0, -4, 0, -1, 0, -4, 0, 1));
  }
}
