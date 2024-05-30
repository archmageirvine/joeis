package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059743 Number of points of norm^2 &lt;= n^2 in the square lattice that are visible from the origin.
 * @author Sean A. Irvine
 */
public class A059743 extends Sequence0 {

  private long mN = -1;

  private long b(final long n, final long m) {
    long s = 0;
    for (long k = 1; k <= m; ++k) {
      if (Functions.GCD.l(n, k) == 1) {
        ++s;
      }
    }
    return s;
  }

  @Override
  public Z next() {
    if (++mN <= 2) {
      switch ((int) mN) {
        case 0:
          return Z.ONE;
        case 1:
          return Z.FIVE;
        default:
          return Z.NINE;
      }
    }
    Z sum = Z.ZERO;
    final CR t = CR.valueOf(mN).divide(CR.SQRT2);
    for (long k = 1; k <= t.floor().longValueExact(); ++k) {
      sum = sum.add(Functions.PHI.l(k));
    }
    for (long k = t.ceil().longValueExact(); k < mN; ++k) {
      sum = sum.add(b(k, Functions.SQRT.l(mN * mN - k * k)));
    }
    return sum.multiply(8).add(1);
  }
}
