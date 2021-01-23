package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000966 n! never ends in this many 0's.
 * @author Sean A. Irvine
 */
public class A000966 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private Polynomial<Z> mNum = RING.one();
  private Polynomial<Z> mDen = RING.one();
  private Polynomial<Z> mPP = RING.one();
  private int mK = 1;
  private int mW = 2;

  private int e(final int n) {
    final Z e = Z.FIVE.pow(n).subtract(1).divide(4);
    if (e.bitLength() > 30) {
      throw new UnsupportedOperationException();
    }
    return e.intValue();
  }

  private Polynomial<Z> num(final int n) {
    return RING.oneMinusXToTheN(e(n) - 1);
  }

  private Polynomial<Z> den(final int n) {
    return RING.oneMinusXToTheN(e(n - 1));
  }

  private Polynomial<Z> t(final int n) {
    return RING.monomial(Z.ONE, e(n) - 6);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mN > mK) {
        mK *= 5;
        ++mW;
        mDen = RING.multiply(mDen, den(mW));
        mNum = RING.add(RING.multiply(mNum, num(mW)), RING.multiply(t(mW), mDen));
        mPP = RING.series(mNum, mDen, mK);
      }
      if (mPP.coeff(mN) != Z.ZERO) {
        return Z.valueOf(mN + 5);
      }
    }
  }
}
