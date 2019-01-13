package irvine.oeis.a000;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000200.
 * @author Sean A. Irvine
 */
public class A000200 implements Sequence {

  protected static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mC = 0;

  @Override
  public Z next() {
    if (++mC == 1) {
      return Z.ZERO;
    }
    final A000598 aa = new A000598() {
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
      Q a = Q.ZERO;
      for (int i = 0, j = mC - 1; i < mC; ++i, --j) {
        a = a.add(tt.coeff(i).multiply(tt.coeff(j)));
      }
      if ((mC & 1) == 1) {
        a = a.add(tt.coeff(mC / 2)); // actually (mC - 1) / 2
      }
      sum = sum.add(a.toZ().divide2());
    }
    return sum;
  }
}
