package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027200 Triangular array T read by rows: <code>T(n,k) =</code> number of partitions of n into an even number of parts, each <code>&gt;=k</code>.
 * @author Sean A. Irvine
 */
public class A027200 extends A027185 {

  private long mN = 0;
  private long mM = 0;

  private Z t(final long n, final long m) {
    Z sum = Z.ZERO;
    for (long k = m; k <= n; ++k) {
      sum = sum.add(mE.get(n, k));
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
