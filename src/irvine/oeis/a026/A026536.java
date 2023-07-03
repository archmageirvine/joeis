package irvine.oeis.a026;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A026536 Irregular triangular array T read by rows: T(i,0 ) = T(i,2i) = 1 for i &gt;= 0; T(i,1) = T(i,2i-1) = floor(i/2) for i &gt;= 1; for even n &gt;= 2, T(i,j) = T(i-1,j-2) + T(i-1,j-1) + T(i-1,j) for j = 2..2i-2, for odd n &gt;= 3, T(i,j) = T(i-1,j-2) + T(i-1,j) for j = 2..2i-2.
 * @author Sean A. Irvine
 */
public class A026536 extends MemoryFunction2Sequence<Long, Z> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0 || m == 2 * n) {
      return Z.ONE;
    }
    if (m == 1 || m == 2 * n - 1) {
      return Z.valueOf(n / 2);
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
