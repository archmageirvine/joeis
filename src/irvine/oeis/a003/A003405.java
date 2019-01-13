package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003405.
 * @author Sean A. Irvine
 */
public class A003405 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private Polynomial<Z> mGf = null;
  private int mDeg = -1;

  // partitions of n into at most 8 parts
  private Z p8(final int n) {
    if (n < 0) {
      return Z.ZERO;
    }
    if (n > mDeg) {
      Polynomial<Z> den = RING.one();
      for (int j = 1; j <= 8; ++j) {
        den = RING.multiply(den, RING.oneMinusXToTheN(j), n);
      }
      mGf = RING.series(RING.one(), den, n);
      mDeg = n;
    }
    return mGf.coeff(n);
  }


  @Override
  public Z next() {
    ++mN;
    return p8(mN)
      .add(p8(mN - 4))
      .add(p8(mN - 7))
      .add(p8(mN - 8).multiply2())
      .add(p8(mN - 9))
      .add(p8(mN - 12))
      .add(p8(mN - 16));
  }
}
