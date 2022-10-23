package irvine.oeis.a036;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036652 Number of bicentered 6-valent trees with n nodes.
 * @author Sean A. Irvine
 */
public class A036652 extends Sequence0 {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mC = 0;

  @Override
  public Z next() {
    if (++mC == 1) {
      return Z.ZERO;
    }
    final A036721 aa = new A036721() {
        @Override
        protected int limit() {
          return mC;
        }
      };

    aa.next();
    Polynomial<Q> oldG = aa.g();
    Z sum = Z.ZERO;
    for (int k = 0; k < mC; ++k) {
      aa.next();
      final Polynomial<Q> g = aa.g();
      final Polynomial<Q> tt = RING.subtract(g, oldG);
      oldG = g;
      // Compute (mC-1)th coefficient in tt^2
      Z a = Z.ZERO;
      for (int i = 0, j = mC - 1; i < mC; ++i, --j) {
        a = a.add(tt.coeff(i).multiply(tt.coeff(j)).toZ());
      }
      if ((mC & 1) == 1) {
        a = a.add(tt.coeff(mC / 2).toZ()); // actually (mC - 1) / 2
      }
      sum = sum.add(a.divide2());
    }
    return sum;
  }
}
