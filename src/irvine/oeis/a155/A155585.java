package irvine.oeis.a155;
// manually egfu at 2021-12-07 13:47

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A155585 a(n) = 2^n*E(n, 1) where E(n, x) are the Euler polynomials.
 * E.g.f.: tanh(x)
 * @author Georg Fischer
 */
public class A155585 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A155585() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.tanh(RING.x(), n);
  }
}
