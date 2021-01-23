package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032113 "BIJ" (reversible, indistinct, labeled) transform of 3,3,3,3...
 * @author Sean A. Irvine
 */
public class A032113 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private Z mF = Z.ONE;
  private int mN = 0;
  {
    mA.add(Q.ZERO);
  }

  static Polynomial<Q> bij(final Polynomial<Q> p, final int n) {
    final Polynomial<Q> t = RING.subtract(RING.one(), RING.divide(RING.pow(p, 2, n), Q.TWO));
    return RING.subtract(RING.series(t, RING.subtract(RING.one(), p), n), RING.one());
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mA.add(new Q(Z.THREE, mF));
    return bij(mA, mN).coeff(mN).multiply(mF).toZ();
  }
}
