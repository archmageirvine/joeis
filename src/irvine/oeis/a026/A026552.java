package irvine.oeis.a026;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026552 Irregular triangular array T read by rows: T(n, 0) = T(n, 2*n) = 1, T(n, 1) = T(n, 2*n-1) = floor(n/2 + 1), for even n &gt;= 2, T(n, k) = T(n-1, k-2) + T(n-1, k-1) + T(n-1, k), otherwise T(n, k) = T(n-1, k-2) + T(n-1, k).
 * @author Sean A. Irvine
 */
public class A026552 extends MemoryFunction2<Long, Z> implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || m == 2 * n) {
      return Z.ONE;
    }
    if (m == 1 || m == 2 * n - 1) {
      return Z.valueOf(n / 2 + 1);
    }
    if ((n & 1) == 0) {
      return get(n - 1, m - 2).add(get(n - 1, m - 1)).add(get(n - 1, m));
    } else {
      return get(n - 1, m - 2).add(get(n - 1, m));
    }
  }

  @Override
  public Z next() {
    if (++mM > 2 * mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
