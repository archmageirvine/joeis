package irvine.oeis.a083;
// manually egfu at 2021-12-03 10:28

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A083007 a(n) = Sum_{k=0..n-1} 3^k*B(k)*C(n,k) where B(k) is the k-th Bernoulli number and C(n,k)=binomial(n,k).
 * E.g.f.: 3*x/(1+exp(x)+exp(2*x))
 * @author Georg Fischer
 */
public class A083007 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A083007() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.monomial(Q.THREE, 1),
      RING.add(RING.add(RING.one(), RING.exp(RING.x(), n)),
        RING.exp(RING.monomial(Q.TWO, 1), n)), n);
  }
}
