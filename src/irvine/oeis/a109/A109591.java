package irvine.oeis.a109;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A109591 E.g.f.: 5x/(-1+1/(-1+1/(-1+1/(-1+log(1+5x))))) = -5x[3-2log(1+5x)]/[5-3log(1+5x)].
 * E.g.f.: 5*x/(-1+1/(-1+1/(-1+1/(-1+log(1+5*x)))))
 * @author Georg Fischer
 */
public class A109591 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A109591() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(RING.monomial(Q.FIVE, 1), RING.add(RING.negate(RING.one()), RING.series(RING.one(), RING.add(RING.negate(RING.one()), RING.series(RING.one(), RING.add(RING.negate(RING.one()), RING.series(RING.one(), RING.add(RING.negate(RING.one()), RING.log(RING.add(RING.one(), RING.monomial(Q.FIVE, 1)), n)), n)), n)), n)), n);
  }
}
