package irvine.oeis.a066;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066139 Squares in every base &gt;=3 (involving no carries and no digit apart from 0, 1 and 2).
 * @author Sean A. Irvine
 */
public class A066139 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private long[] mCoeff = {};

  private boolean bump(final long[] buf) {
    for (int k = 0; k < buf.length - 1; ++k) {
      if (++buf[k] <= 2) {
        return true;
      }
      buf[k] = 0;
    }
    return false;
  }

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ZERO;
    } else if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      if (!bump(mCoeff)) {
        mN += 2;
        mCoeff = new long[mN];
        mCoeff[mCoeff.length - 1] = 1;
      }
      final Polynomial<Z> p = Polynomial.create(mCoeff);
      try {
        final Polynomial<Z> sqrt = RING.sqrt(p, mN);
        if (RING.multiply(sqrt, sqrt).equals(p)) {
          Z res = Z.ZERO;
          for (int k = p.degree(); k >= 0; --k) {
            res = res.multiply(10).add(mCoeff[k]);
          }
          return res;
        }
      } catch (final UnsupportedOperationException e) {
        // ok, sqrt not possible
      }
    }
  }
}
