package irvine.oeis.a006;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A006492 Generalized Lucas numbers.
 * @author Sean A. Irvine
 */
public class A006492 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A006492() {
    super(Polynomial.create(1, -4, 7, -6, 2), RING.pow(Polynomial.create(1, -1, -1), 4));
  }
}

