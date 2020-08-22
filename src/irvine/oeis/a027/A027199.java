package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027199 Triangular array T read by rows: T(n,k) = number of partitions of n into an odd number of parts, each &gt;=k.
 * @author Sean A. Irvine
 */
public class A027199 extends A027185 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    Z sum = Z.ZERO;
    for (long k = m; k <= n; ++k) {
      sum = sum.add(mO.get(n, k));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
