package irvine.oeis.a058;
// manually egfu at 2021-12-07 18:55

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A058562 Another 3-way generalization of series-parallel networks with n labeled edges.
 * E.g.f.: reverse( 3*log(1+x) - 2*x )
 * @author Georg Fischer
 */
public class A058562 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A058562() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return n == 0 ? RING.zero() : RING.reversion(RING.subtract(RING.multiply(RING.monomial(Q.THREE, 0), RING.log(RING.onePlusXToTheN(1), n), n), RING.monomial(Q.TWO, 1)), n);
  }
}
