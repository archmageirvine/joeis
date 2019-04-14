package irvine.oeis.a001;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A001400 Number of partitions of n into at most 4 parts.
 * @author Sean A. Irvine
 */
public class A001400 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A001400() {
    super(RING.one(), Polynomial.create(1, -1, -1, 0, 0, 2, 0, 0, -1, -1, 1));
  }
}
