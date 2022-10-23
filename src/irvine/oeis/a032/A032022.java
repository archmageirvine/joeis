package irvine.oeis.a032;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032022 Number of compositions (ordered partitions) of n into distinct parts &gt;= 2.
 * @author Sean A. Irvine
 */
public class A032022 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Polynomial<Z> sum = RING.zero();
    Polynomial<Z> prod = RING.one();
    Z kf = Z.ONE;
    for (int k = 1; k * k + 3 * k <= 2 * mN; ++k) {
      kf = kf.multiply(k);
      prod = RING.multiply(prod, RING.oneMinusXToTheN(k));
      sum = RING.add(sum, RING.series(RING.monomial(kf, (k * k + 3 * k) / 2), prod, mN));
    }
    return sum.coeff(mN);
  }
}
