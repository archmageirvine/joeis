package irvine.oeis.a001;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A001875 Convolved Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A001875 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A001875() {
    super(RING.one(), RING.pow(Polynomial.create(1, -1, -1), 7));
  }
}
