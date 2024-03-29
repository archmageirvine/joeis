package irvine.oeis.a133;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A133984 E.g.f. satisfies: A(x) = x*(tan(exp(A(x))-1)+1).
 * E.g.f.: reverse(-(x/(-1+tan(1-exp(x)))))
 * @author Georg Fischer
 */
public class A133984 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A133984() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.reversion(RING.negate(RING.series(RING.x(), RING.add(RING.negate(RING.one()), RING.tan(RING.subtract(RING.one(), RING.exp(RING.x(), n)), n)), n)), n);
  }
}
