package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A086146 a(n) is the smallest k&gt;=n such that the number of partitions of k is a multiple of n, or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A086146 extends Sequence1 {

  private long mN = 0;
  private long mK = 0;
  private final LongDynamicLongArray mP = new LongDynamicLongArray();
  {
    mP.set(0, 1);
  }

  private long nextPartitionMod(final long mod) {
    ++mK;
    long t = 0;
    for (long j = 1; ; ++j) {
      final long g1 = j * (3 * j - 1) / 2;
      if (g1 > mK) {
        break;
      }
      t += (j & 1) == 1 ? mP.get(mK - g1) : -mP.get(mK - g1);

      final long g2 = j * (3 * j + 1) / 2;
      if (g2 <= mK) {
        t += (j & 1) == 1 ? mP.get(mK - g2) : -mP.get(mK - g2);
      }
    }
    t %= mod;
    if (t < 0) {
      t += mod;
    }
    mP.set(mK, t);
    return t;
  }

  @Override
  public Z next() {
    ++mN;
    mK = 0;
    while (true) {
      if (nextPartitionMod(mN) == 0 && mK >= mN) {
        return Z.valueOf(mK);
      }
    }
  }
}
