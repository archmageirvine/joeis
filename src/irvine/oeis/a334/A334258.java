package irvine.oeis.a334;
// Generated by gen_seq4.pl egfu at 2021-12-05 23:06

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A334258 a(n) = (-1)^n * exp(n) * Sum_{k&gt;=1} (-1)^k * n^(k-1) * k^n / k!.
 * E.g.f.: 0
 * @author Georg Fischer
 */
public class A334258 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A334258() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.reversion(RING.negate(RING.multiply(RING.log(RING.oneMinusXToTheN(1), n), RING.exp(RING.negate(RING.x()), n), n)), n);
  }
}
