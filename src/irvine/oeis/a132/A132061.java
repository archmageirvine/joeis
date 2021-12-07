package irvine.oeis.a132;
// manually egfsi at 2021-12-05 18:58

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A132061 Alternating row sums of triangle A132056 (S2(8), Stirling2 generalization).
 * E.g.f.: 1-exp(1-(1-7*x)^(-1/7))
 * @author Georg Fischer
 */
public class A132061 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A132061() {
    super(0);
    next();
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.subtract(RING.one(), RING.exp(RING.subtract(RING.one(),
      RING.pow(RING.subtract(RING.one(), RING.monomial(Q.SEVEN, 1)), new Q(-1, 7), n)), n));
  }
}
