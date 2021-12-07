package irvine.oeis.a218;
// manually egfu at 2021-12-07 14:18

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A218653 E.g.f. satisfies: A(x) = 1 + log(1 + x^2*A(x)^2)/x.
 * E.g.f.: (1/x)*reverse(x - log(1+x^2))
 * @author Georg Fischer
 */
public class A218653 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A218653() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.divide(RING.reversion(RING.subtract(RING.x(), RING.log(RING.onePlusXToTheN(2), n)), n), new Q(n));
  }
}
