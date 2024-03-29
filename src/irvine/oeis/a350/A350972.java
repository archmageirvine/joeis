package irvine.oeis.a350;
// Generated by gen_seq4.pl robots/egfu at 2023-05-07 23:33

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A350972 E.g.f. = tan(x).
 * E.g.f.: tan(x)
 * @author Georg Fischer
 */
public class A350972 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A350972() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.tan(RING.x(), mN);
  }
}
