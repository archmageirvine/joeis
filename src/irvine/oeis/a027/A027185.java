package irvine.oeis.a027;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027185 Triangular array O by rows: O(n,k) = number of partitions of n into an odd number of parts, the least being k.
 * @author Sean A. Irvine
 */
public class A027185 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  protected final MemoryFunction2<Long, Z> mO = new MemoryFunction2<Long, Z>() {
    @Override
    protected Z compute(final Long n, final Long m) {
      if (m.equals(n)) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (long k = m; k <= n - m; ++k) {
        sum = sum.add(mE.get(n - m, k));
      }
      return sum;
    }
  };

  protected final MemoryFunction2<Long, Z> mE = new MemoryFunction2<Long, Z>() {
    @Override
    protected Z compute(final Long n, final Long m) {
      if (m.equals(n)) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (long k = m; k <= n - m; ++k) {
        sum = sum.add(mO.get(n - m, k));
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mO.get(mN, mM);
  }
}
