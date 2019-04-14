package irvine.oeis.a002;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A002622 Number of partitions of at most n into at most 5 parts.
 * @author Sean A. Irvine
 */
public class A002622 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A002622() {
    super(RING.one(), Polynomial.create(1, -2, 0, 1, 0, 1, 0, 0, -2, 0, 0, 1, 0, 1, 0, -2, 1));
  }
}
