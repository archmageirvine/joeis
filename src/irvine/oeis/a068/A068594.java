package irvine.oeis.a068;

import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068594.
 * @author Sean A. Irvine
 */
public class A068594 extends Sequence1 {

  private int mN = 0;

  private long product(final long a, long b) {
    long res = 0;
    int k = 1;
    while (b != 0) {
      if ((b & 1) != 0) {
        int j = 1;
        long t = a;
        while (t != 0) {
          if ((t & 1) != 0) {
            res |= 1L << (j * k - 1);
          }
          ++j;
          t >>>= 1;
        }
      }
      ++k;
      b >>>= 1;
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mN >= Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    final HashSet<Long> factorableSubsets = new HashSet<>();
    final long lim = (1L << mN) - 1; // 11....1 (mN ones)
    // a and b are bit sets
    for (long a = 2; a < lim; ++a) {   // proper and non-trivial subsets!
      final long am = LongUtils.log2(a) + 1;
      for (long b = 2; b <= a; ++b) {
        final long bm = LongUtils.log2(b) + 1;
        if (am * bm > mN) {
          break;
        }
        factorableSubsets.add(product(b, a));
      }
    }
    return Z.valueOf(factorableSubsets.size());
  }
}
