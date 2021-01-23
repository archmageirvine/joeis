package irvine.oeis.a032;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032228 Number of ways to partition n elements into pie slices of different sizes allowing the pie to be turned over.
 * @author Sean A. Irvine
 */
public class A032228 implements Sequence {

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
    for (int k = 1; k <= mN; kf = kf.multiply(k++)) {
      final int r = k * (k + 1) / 2;
      if (r > mN) {
        break;
      }
      final Polynomial<Z> num = RING.monomial(k > 2 ? kf : Z.TWO, r);
      den = RING.multiply(den, RING.oneMinusXToTheN(k));
      sum = RING.add(sum, RING.series(num, den, mN));
    }
    return sum.coeff(mN).divide2();
  }
}
