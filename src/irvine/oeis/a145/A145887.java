package irvine.oeis.a145;
// manually egfu at 2021-12-06 08:59

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A145887 Number of excedances in all even permutations of {1,2,...,n} with no fixed points.
 * E.g.f.: (1/4)*x^3*(2-x)*exp(-x)/(1-x)^2
 * @author Georg Fischer
 */
public class A145887 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A145887() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(
      RING.multiply(
        RING.multiply(
          RING.monomial(Q.ONE, 3),
          RING.subtract(RING.monomial(Q.TWO, 0), RING.x())
          , n),
        RING.exp(RING.monomial(Q.NEG_ONE, 1), n)
        , n),
      RING.multiply(RING.pow(RING.oneMinusXToTheN(1), 2, n), RING.monomial(new Q(4, 1), 0), n)
      , n);
  }
}
