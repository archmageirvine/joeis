package irvine.oeis.a046;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A046918 Triangle of coefficients of polynomials p(n), with p(3)=1, p(n) = (1 - t^(2*n - 4))*(1 - t^(2*n - 3))*p(n - 1)/((1 - t^(n - 3))*(1 - t^n)).
 * @author Sean A. Irvine
 */
public class A046918 extends Sequence3 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mA = RING.one();
  private int mN = 3;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mA.degree()) {
      mA = RING.divide(RING.multiply(
        RING.multiply(mA, RING.oneMinusXToTheN(2 * ++mN - 4)),
        RING.oneMinusXToTheN(2 * mN - 3)),
        RING.multiply(RING.oneMinusXToTheN(mN - 3), RING.oneMinusXToTheN(mN)));
      mM = 0;
    }
    return mA.coeff(mM);
  }
}

