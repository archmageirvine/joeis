package irvine.oeis.a212;
// manually egfu at 2021-12-05 17:51

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A212914 E.g.f. satisfies: A(x) = exp( Integral 1 + x*A(x)^3 dx ), where the constant of integration is zero.
 * E.g.f.: 3^(1/3)*exp(x)/(exp(3*x) - 3*exp(3*x)*x + 2)^(1/3)
 * @author Georg Fischer
 */
public class A212914 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A212914() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int mN) {
    return RING.multiply(RING.pow(
        RING.series(RING.monomial(new Q(3), 0),
          RING.add(RING.multiply(RING.exp(RING.monomial(new Q(3), 1), mN), RING.subtract(RING.one(), RING.monomial(new Q(3), 1)), mN), RING.monomial(new Q(2), 0)), mN),
        new Q(1, 3), mN),
      RING.exp(RING.x(), mN), mN);
  }
}
