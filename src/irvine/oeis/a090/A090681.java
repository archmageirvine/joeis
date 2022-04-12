package irvine.oeis.a090;
// manually egfu at 2021-12-07 13:47

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A090681 Expansion of (sec(x/2)^2 + sech(x/2)^2)/2 in powers of x^4.
 * E.g.f.: (sec(x/2)^2 + sech(x/2)^2)/2
 * @author Georg Fischer
 */
public class A090681 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A090681() {
    super(0, 0, 4);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.add(RING.pow(RING.sec(RING.series(RING.x(), RING.monomial(Q.TWO, 0), n), n), 2, n), RING.pow(RING.sech(RING.series(RING.x(), RING.monomial(Q.TWO, 0), n), n), 2, n)), RING.monomial(Q.TWO, 0), n);
  }
}
