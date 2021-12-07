package irvine.oeis.a092;
// manually egfu at 2021-12-03 10:28

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A092085 Alternating row sums of triangle A092082 (S2(7) Stirling2 generalization).
 * E.g.f.: exp(1-(1-6*x)^(1/6))-1
 * -(exp(1 - (1-6*x)^(-1/6)) - 1)
 * @author Georg Fischer
 */
public class A092085 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A092085() {
    super(0);
    next();
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.subtract(RING.one(), RING.exp(RING.subtract(RING.one(),
      RING.exp(RING.multiply(RING.log(RING.subtract(RING.one(), RING.monomial(Q.SIX, 1)), n),
        RING.series(RING.one(), RING.monomial(new Q(-6), 0), n), n), n)), n));
  }
}
