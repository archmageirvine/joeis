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
  public Polynomial<Q> compute(final int n) {
    return RING.multiply(RING.pow(
        RING.series(RING.monomial(Q.THREE, 0),
          RING.add(RING.multiply(RING.exp(RING.monomial(Q.THREE, 1), n), RING.subtract(RING.one(), RING.monomial(Q.THREE, 1)), n), RING.monomial(Q.TWO, 0)), n),
        new Q(1, 3), n),
      RING.exp(RING.x(), n), n);
  }
}
