package irvine.oeis.a002;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A002579 Number of integral points in a certain sequence of closed quadrilaterals.
 * @author Sean A. Irvine
 */
public class A002579 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A002579() {
    super(Polynomial.create(1, 1, 0, 1, 1, 1), RING.multiply(RING.pow(Polynomial.create(1, -1), 2), RING.oneMinusXToTheN(6)));
    next();
  }
}

