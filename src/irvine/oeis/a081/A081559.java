package irvine.oeis.a081;
// manually egfu/egfue at 2021-12-03 10:28

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A081559 Expansion of e.g.f.: exp(cosh(2*x)), even powers only.
 * E.g.f.: exp(cosh(2*x)-1)
 * @author Georg Fischer
 */
public class A081559 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A081559() {
    super(0, 0, 2);
  }

  @Override
  public Polynomial<Q> compute(final int mN) {
    return RING.exp(RING.subtract(RING.cosh(RING.monomial(Q.TWO, 1), mN), RING.one()), mN);
  }
}
