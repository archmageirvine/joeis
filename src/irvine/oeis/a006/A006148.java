package irvine.oeis.a006;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A006148 Number of 4 X n binary matrices up to row and column permutations.
 * @author Sean A. Irvine
 */
public class A006148 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A006148() {
    super(Polynomial.create(1, -1, 4, 9, 23, 39, 90, 131, 204, 238, 252, 238, 204, 131, 90, 39, 23, 9, 4, -1, 1),
      RING.multiply(RING.multiply(RING.multiply(RING.pow(Polynomial.create(1, -1), 6),
        RING.pow(Polynomial.create(1, 0, -1), 3)),
        RING.pow(Polynomial.create(1, 0, 0, -1), 4)),
        RING.pow(Polynomial.create(1, 0, 0, 0, -1), 3)));
  }
}
