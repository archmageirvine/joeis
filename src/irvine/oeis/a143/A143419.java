package irvine.oeis.a143;

import irvine.math.polynomial.Polynomial;
import irvine.oeis.RatPolyGfSequence;

/**
 * A143419 G.f.: <code>1/p(x)</code>, where <code>p(x) =</code> degree 22 Salem polynomial <code>p(x) = x^22 + x^21 - x^19 - 2*x^18 - 3*x^17 - 3*x^16 - 2*x^15 + 2*x^13 + 4*x^12 + 5*x^11 + 4*x^10 + 2*x^9 - 2*x^7 - 3*x^6 - 3*x^5 - 2*x^4 - x^3 + x + 1</code>.
 * @author Sean A. Irvine
 */
public class A143419 extends RatPolyGfSequence {

  /** Construct the sequence. */
  public A143419() {
    super(RING.one(), Polynomial.create(1, 1, 0, -1, -2, -3, -3, -2, 0, 2, 4, 5, 4, 2, 0, -2, -3, -3, -2, -1, 0, 1, 1));
  }
}
