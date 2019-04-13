package irvine.oeis.a001;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A001401 Number of partitions of n into at most 5 parts.
 * @author Sean A. Irvine
 */
public class A001401 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A001401() {
    super(RING.one(), Polynomial.create(1, -1, -1, 0, 0, 1, 1, 1, -1, -1, -1, 0, 0, 1, 1, -1));
  }
}
