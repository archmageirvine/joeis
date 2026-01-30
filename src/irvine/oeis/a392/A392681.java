package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392681 Square array read by upward antidiagonals: T(n,k) = sum of depths of leaves in a complete k-ary tree with n nodes; n &gt;= 1, k &gt;= 2.
 * @author Sean A. Irvine
 */
public class A392681 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    if (n <= 1) {
      return Z.ZERO;
    }
    final Z k = Z.valueOf(m);
    long h = 0;
    while (k.pow(h + 1).subtract(1).divide(m - 1).compareTo(n) < 0) {
      ++h;
    }
    final Z bigM = k.pow(h).subtract(1).divide(m - 1);
    final long totalParents = (n + m - 2) / m;
    final long l = n - totalParents;
    return Z.valueOf(n).subtract(bigM).add(l * (h - 1));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM + 2);
  }
}
