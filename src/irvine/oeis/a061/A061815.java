package irvine.oeis.a061;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061396.
 * @author Sean A. Irvine
 */
public class A061815 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mA = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      Polynomial<Z> sum = RING.one();
      for (int k = 0; k < mN; ++k) {
        sum = RING.add(sum, RING.subtract(RING.pow(RING.add(RING.one(), mA.shift(k + 1)), mA.coeff(k), mN), RING.one()));
      }
      mA = sum;
    }
    return mA.coeff(mN);
  }
}

