package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-01-25.ack/egfu at 2025-01-25 22:44

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A380257 Expansion of e.g.f. exp( (1/(1-3*x)^(2/3) - 1)/2 ).
 * E.g.f.: exp((1/(1-3*x)^(2/3) - 1)/2)
 * @author Georg Fischer
 */
public class A380257 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A380257() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.exp(RING.series(RING.subtract(RING.series(RING.one(), RING.exp(RING.multiply(RING.log(RING.subtract(RING.one(), RING.monomial(new Q(3), 1)), mN), RING.series(RING.monomial(new Q(2), 0), RING.monomial(new Q(3), 0), mN), mN), mN), mN), RING.one()), RING.monomial(new Q(2), 0), mN), mN);
  }
}
