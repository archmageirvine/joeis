package irvine.oeis.a159;
// manually egfu at 2021-12-07 13:47

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A159039 E.g.f. sec(x)/(1-x) = 1/( cos(x) * (1-x) ).
 * E.g.f.: 1/( cos(x) * (1-x) ).
 * @author Georg Fischer
 */
public class A159039 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A159039() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.one(), RING.multiply(RING.cos(RING.x(), n), RING.oneMinusXToTheN(1), n), n);
  }
}
