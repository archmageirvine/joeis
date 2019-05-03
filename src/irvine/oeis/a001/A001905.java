package irvine.oeis.a001;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001905 From higher-order Bernoulli numbers: absolute value of numerator of <code>D-number D2n(2n-1)</code>.
 * @author Sean A. Irvine
 */
public class A001905 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> A = RING.create(Arrays.asList(Q.ZERO, Q.ZERO, Q.ONE));
  private Z mF = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 0) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    final Polynomial<Q> sqrt = RING.sqrt1p(A, mN + 1);
    final Polynomial<Q> logSqrt = RING.log(RING.add(sqrt, RING.x()), mN + 1);
    final Polynomial<Q> a = RING.series(RING.x(), logSqrt, mN);
    final Polynomial<Q> a2 = RING.multiply(a, a, mN);
    final Polynomial<Q> b = RING.series(a2, sqrt, mN);
    return b.coeff(mN).multiply(mF).num().abs();
  }
}
