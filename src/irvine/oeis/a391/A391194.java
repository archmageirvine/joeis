package irvine.oeis.a391;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391194 allocated for Murray R. Bremner.
 * @author Sean A. Irvine
 */
public class A391194 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mA = RING.one();
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = RING.add(RING.one(), RING.multiply(RING.divide(RING.add(RING.multiply(RING.multiply(mA, mA, mN), Z.THREE), mA.substitutePower(2, mN)), Z.TWO), mA, mN).shift(1));
    }
    return mA.coeff(mN);
  }
}
