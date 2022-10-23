package irvine.oeis.a036;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036775 a(n) is the number of labeled rooted trees on a set of size n where each node has at most 3 neighbors that are further away from the root than the node itself.
 * @author Sean A. Irvine
 */
public class A036775 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Q Q6 = Q.SIX;
  private Polynomial<Q> mA = RING.one();
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mF = mF.multiply(mN);
    final Polynomial<Q> a2 = RING.multiply(mA, mA, mN);
    final Polynomial<Q> a3 = RING.multiply(mA, a2, mN);
    mA = RING.add(RING.add(RING.add(RING.one(), mA.shift(1)), RING.divide(a2.shift(2), Q.TWO)), RING.divide(a3.shift(3), Q6));
    return mA.coeff(mN - 1).multiply(mF).toZ();
  }
}
