package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032299 "EFJ" (unordered, size, labeled) transform of 1,2,3,4,...
 * @author Sean A. Irvine
 */
public class A032299 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    Polynomial<Q> egf = RING.one();
    Q kf = Q.ONE;
    for (int k = 1; k <= mN; ++k) {
      egf = RING.multiply(egf, RING.onePlusXToTheN(kf, k), mN);
      kf = kf.divide(k);
    }
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
