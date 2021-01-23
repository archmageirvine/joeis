package irvine.oeis.a032;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032300 "EFJ" (unordered, size, labeled) transform of 1,3,5,7,...
 * @author Sean A. Irvine
 */
public class A032300 implements Sequence {

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
      kf = kf.divide(k);
      egf = RING.multiply(egf, RING.onePlusXToTheN(kf.multiply(2L * k - 1), k), mN);
    }
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
