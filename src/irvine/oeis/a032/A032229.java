package irvine.oeis.a032;

import irvine.math.function.Functions;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032229 Number of ways to partition n elements into pie slices of different odd sizes allowing the pie to be turned over.
 * @author Sean A. Irvine
 */
public class A032229 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Polynomial<Z> sum = RING.one();
    Polynomial<Z> den = RING.one();
    Z kf = Z.ONE;
    for (int k = 1; k <= Functions.SQRT.i(mN); kf = kf.multiply(k++)) {
      final int r = k * k;
      final Polynomial<Z> num = RING.monomial(k > 2 ? kf : Z.TWO, r);
      den = RING.multiply(den, RING.oneMinusXToTheN(2 * k));
      sum = RING.add(sum, RING.series(num, den, mN));
    }
    return sum.coeff(mN).divide2();
  }
}
