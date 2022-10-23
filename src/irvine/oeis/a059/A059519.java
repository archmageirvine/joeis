package irvine.oeis.a059;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059519 Number of partitions of n all of whose subpartitions sum to distinct values. Partition(n) = [a, b, c...] where 2n = 2^a + 2^b + 2^c + ...
 * @author Sean A. Irvine
 */
public class A059519 extends Sequence1 {

  private long mN = 0;
  private final int[] mBits = new int[64];

  private boolean is(final int k) {
    final HashSet<Long> seen = new HashSet<>();
    for (long s = 0; s < 1L << k; ++s) {
      long t = s;
      long sum = 0;
      int p = 0;
      while (t != 0) {
        if ((t & 1) == 1) {
          sum += mBits[p];
        }
        ++p;
        t >>>= 1;
      }
      if (!seen.add(sum)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      int k = 0;
      int j = 0;
      while (m != 0) {
        ++j;
        if ((m & 1) == 1) {
          mBits[k++] = j;
        }
        m >>>= 1;
      }
      if (is(k)) {
        return Z.valueOf(mN);
      }
    }
  }
}
