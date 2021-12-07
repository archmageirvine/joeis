package irvine.oeis.a277;

import java.util.Collections;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A277458.
 * @author Sean A. Irvine
 */
public class A277458 extends ExponentialGeneratingFunction {

  private static final Polynomial<Q> NEG_ONE = RING.create(Collections.singletonList(Q.NEG_ONE));
  private static final Polynomial<Q> NEG_X = RING.negate(RING.x());

  /** Construct the sequence. */
  public A277458() {
    super(0);
  }

  @Override
  public Polynomial<Q> compute(final int n) {
    return RING.series(NEG_ONE, RING.subtract(RING.one(), RING.lambertW(NEG_X, n)), n);
  }
}
