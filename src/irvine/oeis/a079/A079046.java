package irvine.oeis.a079;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079046 Coefficients of the polynomials in the numerator of the generating function f(x)=(x-x^2)/(x^3-2x^2-2x+1) for F(n)^2, (where F(n) is the Fibonacci sequence) and its successive derivatives starting with the highest power of x.
 * @author Sean A. Irvine
 */
public class A079046 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> D = Polynomial.create(1, -2, -2, 1);
  private Polynomial<Z> mNum = Polynomial.create(0, 1, -1);
  private Polynomial<Z> mDen = D;
  private int mN = 3;

  @Override
  public Z next() {
    if (--mN < 0) {
      mNum = RING.subtract(RING.multiply(mDen, RING.diff(mNum)), RING.multiply(mNum, RING.diff(mDen)));
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
