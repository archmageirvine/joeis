package irvine.oeis.a003;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.RatPolyGfSequence;

/**
 * A003403 G.f.: <code>(1+x^3+x^4+</code>...+x^12+x^15)/Prod_{i=1..10} <code>(1-x^i)</code>.
 * @author Sean A. Irvine
 */
public class A003403 extends RatPolyGfSequence {

  private static final Polynomial<Z> DEN;
  static {
    Polynomial<Z> den = RING.one();
    for (int k = 1; k <= 10; ++k) {
      den = RING.multiply(den, RING.oneMinusXToTheN(k));
    }
    DEN = den;
  }

  /** Construct the sequence. */
  public A003403() {
    super(Polynomial.create(1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1), DEN);
  }
}

