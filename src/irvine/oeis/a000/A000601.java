package irvine.oeis.a000;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A000601 Expansion of <code>1/((1-x)^2*(1-x^2)*(1-x^3))</code>.
 * @author Sean A. Irvine
 */
public class A000601 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A000601() {
    super(RING.one(), Polynomial.create(1, -2, 0, 1, 1, 0, -2, 1));
  }
}
