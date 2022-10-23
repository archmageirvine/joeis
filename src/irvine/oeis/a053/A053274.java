package irvine.oeis.a053;

import java.util.Arrays;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053274 Coefficients of the '6th-order' mock theta function gamma(q).
 * @author Sean A. Irvine
 */
public class A053274 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int k = 0; k * k <= mN; ++k) {
      Polynomial<Z> den = RING.one();
      final int s = mN - k * k;
      for (int j = 1; j <= k; ++j) {
        final Z[] t = new Z[2 * j + 1];
        Arrays.fill(t, Z.ZERO);
        t[0] = Z.ONE;
        t[j] = Z.ONE;
        t[2 * j] = Z.ONE;
        den = RING.multiply(den, Polynomial.create(t), s);
      }
      sum = RING.add(sum, RING.series(RING.one(), den, s).shift(k * k));
    }
    return sum.coeff(mN);
  }
}
