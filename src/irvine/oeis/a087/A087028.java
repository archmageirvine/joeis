package irvine.oeis.a087;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;

/**
 * A087028 Number of bounded (&lt;=n) lunar divisors of n.
 * @author Sean A. Irvine
 */
public class A087028 extends Sequence1 {

  private final LongDynamicArray<Set<Long>> mCounts = new LongDynamicArray<>();
  private long mN = 0;

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
    for (long d = 1; d <= mN; ++d) {
      update(mN, d);
      update(d, mN);
    }
    return Z.valueOf(mCounts.get(mN).size());
  }
}
