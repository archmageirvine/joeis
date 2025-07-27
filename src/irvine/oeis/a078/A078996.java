package irvine.oeis.a078;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078996 Triangle read by rows: let f(x) = x/(1-x-x^2); n-th row gives coefficients of denominator polynomial of n-th derivative f(x)^(n), with highest powers first, for n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A078996 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> D = Polynomial.create(1, -1, -1);
  private Polynomial<Z> mNum = Polynomial.create(0, 1);
  private Polynomial<Z> mDen = D;
  private int mN = 3;
  private boolean mEven = true;

  @Override
  public Z next() {
    if (--mN < 0) {
      mNum = RING.subtract(RING.multiply(mNum, RING.diff(mDen)), RING.multiply(mDen, RING.diff(mNum)));
      mDen = RING.multiply(mDen, mDen);
      mEven = !mEven;
      if (mEven) {
        mDen = RING.negate(mDen);
      }
      while (true) {
        final Polynomial<Z>[] qr = RING.divideAndRemainder(mNum, D);
        if (!RING.isZero(qr[1])) {
          break;
        }
        mNum = qr[0];
        mDen = RING.divide(mDen, D);
      }
      mN = mDen.degree();
    }
    return mDen.coeff(mN);
  }
}
