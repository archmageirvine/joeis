package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-01-25.ack/egfu at 2025-01-25 22:44

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A380338 Expansion of e.g.f. log(1 - x * log(1 - x)).
 * E.g.f.: log(1 - x * log(1 - x))
 * @author Georg Fischer
 */
public class A380338 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A380338() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.log(RING.subtract(RING.one(), RING.multiply(RING.x(), RING.log(RING.oneMinusXToTheN(1), mN), mN)), mN);
  }
}
