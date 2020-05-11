package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032035 Number of increasing rooted 2,3 cacti (triangular cacti with bridges) with <code>n-1</code> nodes.
 * @author Sean A. Irvine
 */
public class A032035 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  private Polynomial<Q> mEGF = RING.x();
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mEGF = RING.integrate(RING.add(RING.one(), RING.integrate(RING.series(RING.one(), RING.subtract(RING.one(), mEGF), mN))));
    return mEGF.coeff(mN).multiply(mF).toZ();
  }
}
