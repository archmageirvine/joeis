package irvine.oeis.a053;

import java.util.Arrays;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053255 Coefficients of the '3rd-order' mock theta function rho(q).
 * @author Sean A. Irvine
 */
public class A053255 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> sum = RING.zero();
    for (int k = 0; k * k <= mN; ++k) {
      Polynomial<Z> prod = RING.one();
      for (int j = 0; j <= k; ++j) {
        final Z[] t = new Z[4 * j + 3];
        Arrays.fill(t, Z.ZERO);
        t[0] = Z.ONE;
        t[2 * j + 1] = Z.ONE;
        t[4 * j + 2] = Z.ONE;
        prod = RING.multiply(prod, Polynomial.create(t), mN);
      }
      final int sh = 2 * k * (k + 1);
      sum = RING.add(sum, RING.series(RING.one(), prod, mN - sh).shift(sh));
    }
    return sum.coeff(mN);
  }
}
