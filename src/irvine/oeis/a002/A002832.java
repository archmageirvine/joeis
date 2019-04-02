package irvine.oeis.a002;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002832 Median Euler numbers.
 * @author Sean A. Irvine
 */
public class A002832 implements Sequence {

  // After Barbara Haas Margolius and Mathar.  Recomputed at each stage
  // because of precision of series expansion.

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z[][] rr = new Z[2 * mN][2 * mN];
    Polynomial<Q> p = RING.series(RING.subtract(RING.exp(RING.x(), 2 * mN), RING.one()), RING.cosh(RING.x(), 2 * mN), 2 * mN);
    rr[0][0] = Z.ZERO;
    for (int k = 1; k < rr.length; ++k) {
      p = RING.diff(p);
      rr[k][0] = RING.eval(p, Q.ZERO).toZ();
    }
    for (int k = 1; k < rr.length; ++k) {
      for (int j = 1; j <= k; ++j) {
        rr[k][j] = rr[k][j - 1].subtract(rr[k - 1][j - 1]);
      }
    }
    return rr[2 * mN - 1][mN - 1].abs();
  }
}
