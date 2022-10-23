package irvine.oeis.a054;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A054655 Triangle T(n,k) giving coefficients in expansion of n!*binomial(x-n,n) in powers of x.
 * @author Sean A. Irvine
 */
public class A054655 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mA = null;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mM = ++mN;
      mA = RING.one();
      for (int k = 0; k < mN; ++k) {
        mA = RING.multiply(mA, Polynomial.create(-mN - k, 1));
      }
    }
    return mA.coeff(mM);
  }
}

