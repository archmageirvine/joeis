package irvine.oeis.a001;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A001993 Number of two-rowed partitions of length 3.
 * @author Sean A. Irvine
 */
public class A001993 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A001993() {
    super(RING.one(), Polynomial.create(1, -1, -2, 0, 2, 4, -1, -3, -3, -1, 4, 2, 0, -2, -1, 1));
  }
}
