package irvine.oeis.a001;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A001849 Crystal ball sequence for 7-dimensional cubic lattice.
 * @author Sean A. Irvine
 */
public class A001849 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A001849() {
    super(RING.pow(Polynomial.create(1, 1), 7), RING.pow(Polynomial.create(1, -1), 8));
  }
}
