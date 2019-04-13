package irvine.oeis.a001;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A001874 Convolved Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A001874 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A001874() {
    super(RING.one(), RING.pow(Polynomial.create(1, -1, -1), 6));
  }
}
