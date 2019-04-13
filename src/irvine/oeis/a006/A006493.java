package irvine.oeis.a006;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A006493 Generalized Lucas numbers.
 * @author Sean A. Irvine
 */
public class A006493 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A006493() {
    super(RING.multiply(RING.pow(Polynomial.create(1, -1), 3), Polynomial.create(1, -2, 2)), RING.pow(Polynomial.create(1, -1, -1), 5));
  }
}

