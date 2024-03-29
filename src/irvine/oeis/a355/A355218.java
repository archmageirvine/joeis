package irvine.oeis.a355;
// Generated by gen_seq4.pl robots/egfu at 2023-05-07 23:33

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A355218 a(n) = Sum_{k&gt;=1} (3*k - 1)^n / 2^k.
 * E.g.f.: exp(2*x) / (2 - exp(3*x))
 * @author Georg Fischer
 */
public class A355218 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A355218() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.exp(RING.monomial(Q.TWO, 1), mN), RING.subtract(RING.monomial(Q.TWO, 0), RING.exp(RING.monomial(Q.THREE, 1), mN)), mN);
  }
}
