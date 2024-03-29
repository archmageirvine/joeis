package irvine.oeis.a352;
// Generated by gen_seq4.pl robots/egfu at 2023-05-07 23:33

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A352326 Expansion of e.g.f.: 1/(2 - exp(x) - sinh(x)).
 * E.g.f.: 1/(2 - exp(x) - sinh(x))
 * @author Georg Fischer
 */
public class A352326 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A352326() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.one(), RING.subtract(RING.subtract(RING.monomial(Q.TWO, 0), RING.exp(RING.x(), mN)), RING.sinh(RING.x(), mN)), mN);
  }
}
