package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000706.
 * @author Sean A. Irvine
 */
public class A000706 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private Polynomial<Z> mDen = RING.one();

  @Override
  public Z next() {
    if (++mN > 0) {
      final Z s = Cheetah.factor(mN).sigma(5).multiply(504);
      mDen = RING.subtract(mDen, RING.monomial(s, mN));
    }
    return RING.coeff(RING.one(), mDen, mN);
  }
}
