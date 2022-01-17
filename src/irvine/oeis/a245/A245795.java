package irvine.oeis.a245;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A245795 Number of preferential arrangements of n labeled elements when at least k=10 elements per rank are required.
 * E.g.f.: 1/(2 + x - exp(x) + x^2/2 + x^3/6 + x^4/24 + x^5/120 + x^6/720 + x^7/5040 + x^8/40320 + x^9/362880)
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A245795 extends ExponentialGeneratingFunction {

  private static final Polynomial<Q> C = Polynomial.create(Q.TWO, Q.ONE, Q.HALF, new Q(1, 6), new Q(1, 24), new Q(1, 120), new Q(1, 720), new Q(1, 5040), new Q(1, 40320), new Q(1, 362880));

  /** Construct the sequence. */
  public A245795() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.one(), RING.subtract(C, RING.exp(RING.x(), n)), n);
  }
}
