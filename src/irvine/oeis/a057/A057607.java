package irvine.oeis.a057;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.LongDynamicLongArray;

/**
 * A057607 Triangle T(n,k) = number of binary n-tuples u having exactly k grandchildren, where a grandchild is a vector obtained by deleting any two coordinates of u (n &gt;= 2, 0&lt;=k&lt;=2^(n-2)).
 * @author Sean A. Irvine
 */
public class A057607 extends Sequence2 {

  private int mN = 1;
  private long mM = 1;
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();

  @Override
  public Z next() {
    if (++mM > 1L << (mN - 2)) {
      mCounts.truncate(0);
      if (++mN == 2) {
        return Z.FOUR;
      }
      mM = 0;
      final HashSet<Long> seen = new HashSet<>();
      final long lim = 1L << mN;
      for (long k = 0; k < lim; ++k) {
        seen.clear();
        long cnt = 0;
        for (int j = 0; j < mN; ++j) {
          final long maskj = (1L << j) - 1;
          final long compj = ~maskj;
          final long s = (k & maskj) | ((k >>> 1) & compj); // delete bit j
          for (int i = j; i < mN - 1; ++i) {
            final long maski = (1L << i) - 1;
            final long compi = ~maski;
            final long t = (s & maski) | ((s >>> 1) & compi); // delete bit i
            if (seen.add(t)) {
              ++cnt;
            }
          }
        }
        mCounts.increment(cnt);
      }
    }
    return Z.valueOf(mCounts.get(mM));
  }
}
