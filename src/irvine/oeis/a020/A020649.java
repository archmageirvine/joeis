package irvine.oeis.a020;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A020649 Least quadratic nonresidue modulo n (with n &gt;= 3).
 * @author Sean A. Irvine
 */
public class A020649 extends Sequence3 {

  private long mN = 2;

  private boolean isQuadraticResidue(final long q, final long n) {
    for (long x = 2; x <= n / 2; ++x) {
      if (LongUtils.modPow(x, 2, n) == q) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 2;
    while (isQuadraticResidue(k, mN)) {
      ++k;
    }
    return Z.valueOf(k);
  }
}
