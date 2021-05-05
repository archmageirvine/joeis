package irvine.oeis.a046;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046919 Maximal coefficient of polynomial p(n), with p(3)=1, p(n) = (1 - t^(2*n - 4))*(1 - t^(2*n - 3))*p(n - 1)/((1 - t^(n - 3))*(1 - t^n)).
 * @author Sean A. Irvine
 */
public class A046919 implements Sequence {

  private final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mA = RING.one();
  private int mN = 2;

  @Override
  public Z next() {
    if (++mN > 3) {
      mA = RING.divide(RING.multiply(
        RING.multiply(mA, RING.oneMinusXToTheN(2 * mN - 4)),
        RING.oneMinusXToTheN(2 * mN - 3)),
        RING.multiply(RING.oneMinusXToTheN(mN - 3), RING.oneMinusXToTheN(mN)));
    }
    Z max = mA.coeff(0);
    for (int k = 1; k <= mA.degree(); ++k) {
      max = max.max(mA.coeff(k));
    }
    return max;
  }
}

