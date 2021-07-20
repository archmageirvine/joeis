package irvine.oeis.a002;

import java.util.Arrays;
import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002435 Second-order Euler numbers.
 * @author Sean A. Irvine
 */
public class A002435 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWO = RING.create(Collections.singletonList(Q.TWO));
  private static final Polynomial<Q> NEG_X = RING.create(Arrays.asList(Q.ZERO, Q.NEG_ONE));
  private int mN = 1;

  private Polynomial<Q> nDiff(final Polynomial<Q> p, final int n) {
    Polynomial<Q> r = p;
    for (int k = 0; k < n; ++k) {
      r = RING.diff(r);
    }
    return r;
  }

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> expSum = RING.add(RING.exp(RING.x(), mN + 2), RING.exp(NEG_X, mN + 2));
    final Polynomial<Q> f = RING.series(TWO, expSum, mN + 2);
    final Polynomial<Q> expDiff = RING.subtract(RING.exp(RING.x(), mN), RING.exp(NEG_X, mN));
    final Polynomial<Q> z = RING.pow(RING.series(expDiff, expSum, mN), 2, mN);
    final Polynomial<Q> w = RING.diff(z);
    final Polynomial<Q> fn = nDiff(f, mN - 1);
    final Polynomial<Q> d = (mN & 1) == 1 ? f : RING.diff(f);
    final Polynomial<Q> t = RING.series(RING.diff(RING.series(fn, d, mN)), w, mN);
    return RING.eval(t, Q.ZERO).toZ().abs();
  }
}
