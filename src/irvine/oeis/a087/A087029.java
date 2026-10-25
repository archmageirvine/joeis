package irvine.oeis.a087;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;

/**
 * A087029 Number of lunar divisors of n (unbounded version).
 * @author Sean A. Irvine
 */
public class A087029 extends Sequence1 {

  private final LongDynamicArray<Set<Long>> mCounts = new LongDynamicArray<>();
  private long mN = 0;
  private long mM = 0;

  private void update(final long n, final long d) {
    final long res = A087062.lunarMul(Z.valueOf(n), Z.valueOf(d)).longValueExact();
    if (mCounts.get(res) == null) {
      mCounts.set(res, new HashSet<>());
    }
    mCounts.get(res).add(d);
  }

  @Override
  public Z next() {
    ++mN;
    while (mM < 10 * mN) {
      ++mM;
      for (long d = 1; d <= mM; ++d) {
        update(mM, d);
        update(d, mM);
      }
    }
    return Z.valueOf(mCounts.get(mN).size());
  }
}
