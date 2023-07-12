package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A026584 Irregular triangular array T read by rows: T(i,0) = T(i,2i) = 1 for i &gt;= 0; T(i,1) = T(i,2i-1) = floor(i/2) for i &gt;= 1; and for i &gt;= 2 and j = 2..2i-2, T(i,j) = T(i-1,j-2) + T(i-1,j-1) + T(i-1,j) if i+j is odd, and T(i,j) = T(i-1,j-2) + T(i-1,j) if i+j is even.
 * @author Sean A. Irvine
 */
public class A026584 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A026584() {
    super(1);
  }

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
    if (((n + m) & 1) == 0) {
      return get(n - 1, m - 2).add(get(n - 1, m));
    } else {
      return get(n - 1, m - 2).add(get(n - 1, m - 1)).add(get(n - 1, m));
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
