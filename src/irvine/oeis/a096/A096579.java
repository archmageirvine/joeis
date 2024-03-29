package irvine.oeis.a096;
// Generated by gen_seq4.pl egfu at 2021-12-07 21:31

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A096579 Number of partitions of an n-set with exactly one even block.
 * E.g.f.: exp(sinh(x))*(cosh(x)-1)
 * @author Georg Fischer
 */
public class A096579 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A096579() {
    super(1);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.multiply(RING.exp(RING.sinh(RING.x(), n), n), RING.subtract(RING.cosh(RING.x(), n), RING.one()), n);
  }
}
