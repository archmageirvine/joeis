package irvine.oeis.a064;

import irvine.math.IntegerUtils;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064053 Auxiliary sequence gamma(n) used to compute coefficients in series expansion of the mock theta function f(q) via A(n) = Sum_{r=0..n} p(r)*gamma(n-r), with p(r) the partition function A000041.
 * @author Sean A. Irvine
 */
public class A064053 extends Sequence0 {

  // After Michael Somos

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Polynomial<Z> sum = RING.zero();
    for (int k = 1; k <= (IntegerUtils.sqrt(24 * mN + 1) - 1) / 6; ++k) {
      final Polynomial<Z> t = RING.monomial(Z.ONE, (3 * k * k + k) / 2);
      sum = RING.signedAdd((k & 1) == 0, sum, RING.series(t, RING.onePlusXToTheN(k), mN));
    }
    return sum.coeff(mN).multiply(4);
  }
}
