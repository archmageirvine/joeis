package irvine.oeis.a072;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072248 extends Sequence2 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 1;
  private int mM = 0;

  private Polynomial<Z> t(final int k, final int n) {
    if (k == 0) {
      return RING.x();
    }
    return RING.series(RING.x(), RING.subtract(RING.one(), RING.pow(t(k - 1, n), 2, n).shift(-1)), n);
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return t(mM, mN).coeff(mN).subtract(t(mM - 1, mN).coeff(mN));
  }
}
