package irvine.oeis.a018;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018794.
 * @author Sean A. Irvine
 */
public class A018794 implements Sequence {

  // After David Nacin

  private int mN = -1;

  protected int ap() {
    return 9;
  }

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    // Precompute bit sets of arithmetic progressions
    int len = 0;
    final int maxSkip = (mN + ap() - 2) / (ap() - 1);
    for (int skip = 1; skip < maxSkip; ++skip) {
      len += mN - (ap() - 1) * skip;
    }
    final long[] aps = new long[len];
    int k = 0;
    for (int skip = 1; skip < maxSkip; ++skip) {
      for (int start = 0; start < mN - (ap() - 1) * skip; ++start) {
        for (int j = 0; j < ap(); ++j) {
          aps[k] += 1L << (start + j * skip);
        }
        ++k;
      }
    }

    long sum = 0;
    final long limit = 1L << mN;
    for (int i = ap(); i <= mN; ++i) {
      for (long swizzle = (1L << i) - 1; swizzle < limit; swizzle = LongUtils.swizzle(swizzle)) {
        for (final long ap : aps) {
          if ((ap & swizzle) == ap) {
            ++sum;
            break;
          }
        }
      }
    }
    return Z.valueOf(sum);
  }
}
