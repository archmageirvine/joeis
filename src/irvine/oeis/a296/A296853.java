package irvine.oeis.a296;
// manually egfu/egfue at 2021-12-05 17:51

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A296853 Expansion of e.g.f. tanh(x*tan(x/2)) (even powers only).
 * E.g.f.: tanh(x*tan(x/2))
 * @author Georg Fischer
 */
public class A296853 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A296853() {
    super(0, 0, 2);
  }

  @Override
  public Polynomial<Q> compute(final int mN) {
    return RING.subtract(RING.tanh(RING.multiply(RING.x(), RING.tan(RING.series(RING.x(), RING.monomial(new Q(2), 0), mN), mN), mN), mN), RING.one());
  }
}
