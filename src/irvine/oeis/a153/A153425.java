package irvine.oeis.a153;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A153425.
 * @author Sean A. Irvine
 */
public class A153425 implements Sequence {

  private long mN = 0;
  private final long[] mPhiCache = new long[1000000];

  private long digitProduct(long n) {
    long p = 1;
    while (n != 0 && p != 0) {
      p *= n % 10;
      n /= 10;
    }
    return p;
  }

  private long phi(final long p) {
    if (p < mPhiCache.length) {
      final int pp = (int) p;
      final long r = mPhiCache[pp];
      if (r != 0) {
        return r;
      }
      final long c = LongUtils.phi(p);
      mPhiCache[pp] = c;
      return c;
    } else {
      return LongUtils.phi(p);
    }
  }

  @Override
  public Z next() {
    while (true) {
      final long p = digitProduct(++mN);
      if (p != 0) {
        final long e = phi(p);
        if (e * p == mN) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

