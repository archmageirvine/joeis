package irvine.oeis.a352;
// Generated by gen_seq4.pl robots/egfu at 2023-05-07 23:33

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A352075 Expansion of e.g.f. sqrt(1 - log(1 - 2*x)).
 * E.g.f.: sqrt(1 - log(1 - 2*x))
 * @author Georg Fischer
 */
public class A352075 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A352075() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.pow(RING.subtract(RING.one(), RING.log(RING.subtract(RING.one(), RING.monomial(Q.TWO, 1)), mN)), Q.HALF, mN);
  }
}
