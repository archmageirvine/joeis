package irvine.oeis.a003;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A003479 Expansion of <code>1/((1-x)*(1-x-2*x^3))</code>.
 * @author Sean A. Irvine
 */
public class A003479 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A003479() {
    super(RING.one(), Polynomial.create(1, -2, 1, -2, 2));
  }
}

