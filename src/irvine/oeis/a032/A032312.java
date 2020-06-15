package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032312 "EGJ" <code>(unordered</code>, element, labeled) transform of 2,2,2,2...
 * @author Sean A. Irvine
 */
public class A032312 implements Sequence {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Z mF = Z.ONE;
  private int mN = -1;

  protected Polynomial<Q> egj(final int n) {
    Q f = Q.ONE;
    Polynomial<Q> efk = RING.one();
    for (int k = 1; k <= n; ++k) {
      f = f.divide(k);
      efk = RING.multiply(efk, RING.pow(RING.onePlusXToTheN(f, k), 2, n), n);
    }
    return efk;
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return egj(mN).coeff(mN).multiply(mF).toZ();
  }
}
