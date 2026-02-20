package irvine.oeis.a078;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078991 Coefficients of the polynomials in the numerator of the generating function x/(1-x-x^2) for the Fibonacci sequence and its successive derivatives starting with the highest power of x.
 * @author Sean A. Irvine
 */
public class A078991 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> D = Polynomial.create(1, -1, -1);
  private Polynomial<Z> mNum = Polynomial.create(0, 1);
  private Polynomial<Z> mDen = D;
  private int mN = 2;
  private boolean mFirst = true;

  @Override
  public Z next() {
    if (--mN < 0) {
      mNum = RING.subtract(RING.multiply(mNum, RING.diff(mDen)), RING.multiply(mDen, RING.diff(mNum)));
      if (mFirst) {
        // Contortions to match signs
        mFirst = false;
        mNum = RING.negate(mNum);
      }
      mDen = RING.multiply(mDen, mDen);
      while (true) {
        final Polynomial<Z>[] qr = RING.divideAndRemainder(mNum, D);
        if (!RING.isZero(qr[1])) {
          break;
        }
        mNum = qr[0];
        mDen = RING.divide(mDen, D);
      }
      mN = mNum.degree();
    }
    return mNum.coeff(mN);
  }
}
