package irvine.oeis.a016;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016021 Number of permutations of {1,2,...,n} in which each element follows its proper divisors.
 * @author Sean A. Irvine
 */
public class A016021 implements Sequence {

  private final long[] mDivisorSets = new long[64];
  private TreeMap<Long, Z> mCounts = new TreeMap<>();
  private int mN = -1;

  private long divisorSet(final int n) {
    long d = 0;
    if (n > 1) {
      for (final Z dd : Jaguar.factor(n).divisors()) {
        final int v = dd.intValue();
        if (v != n) {
          d |= 1L << (v - 1);
        }
      }
    }
    return d;
  }

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    mDivisorSets[mN] = divisorSet(mN);
    if (mN == 0) {
      return Z.ONE;
    }
    mCounts.clear();
    mCounts.put(1L, Z.ONE);
    for (int m = 2; m <= mN; ++m) {
      final TreeMap<Long, Z> next = new TreeMap<>();
      for (final Map.Entry<Long, Z> e : mCounts.entrySet()) {
        final long key = e.getKey();
        final Z cnt = e.getValue();
        for (int k = 2; k <= mN; ++k) {
          final long dk = mDivisorSets[k];
          final long bit = 1L << (k - 1);
          if ((key & bit) == 0 && (key & dk) == dk) {
            final long newKey = key | bit;
            final Z u = next.get(newKey);
            next.put(newKey, u == null ? cnt : u.add(cnt));
          }
        }
      }
      mCounts = next;
    }
    return mCounts.get((1L << mN) - 1);
  }

}
