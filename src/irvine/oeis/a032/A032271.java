package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032271 Shifts left under "DIJ" <code>(bracelet</code>, indistinct, labeled) transform, with <code>a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A032271 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mA = RING.zero();
  private int mN = 0;
  private Z mF = Z.ONE;

  static Polynomial<Q> dij(final Polynomial<Q> g, final int n) {
    return RING.divide(RING.subtract(RING.add(g, RING.divide(RING.pow(g, 2, n), Q.TWO)), RING.log1p(RING.negate(g), n)), Q.TWO);
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA = RING.integrate(RING.add(RING.one(), dij(mA, mN)));
    return mA.coeff(mN).multiply(mF).toZ();
  }
}
