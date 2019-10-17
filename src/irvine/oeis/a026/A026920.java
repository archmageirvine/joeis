package irvine.oeis.a026;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026920 Triangular array O by rows: <code>O(n,k) =</code> number of partitions of n into an odd number of parts, the greatest being k.
 * @author Sean A. Irvine
 */
public class A026920 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  protected final MemoryFunction2<Long, Z> mO = new MemoryFunction2<Long, Z>() {
    @Override
    protected Z compute(final Long n, final Long m) {
      if (m == 1) {
        return (n & 1) == 0 ? Z.ZERO : Z.ONE;
      }
      Z sum = Z.ZERO;
      for (long k = 1; k <= Math.min(m, n - m + 1); ++k) {
        sum = sum.add(mE.get(n - m, k));
      }
      return sum;
    }
  };

  protected final MemoryFunction2<Long, Z> mE = new MemoryFunction2<Long, Z>() {
    @Override
    protected Z compute(final Long n, final Long m) {
      if (m == 1) {
        return (n & 1) == 0 ? Z.ONE : Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (long k = 1; k <= Math.min(m, n - m); ++k) {
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
