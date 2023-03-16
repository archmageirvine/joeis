package irvine.oeis.a153;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A153425 Numbers n such that n = p*phi(p) where p is product of the digits of n.
 * @author Sean A. Irvine
 */
public class A153425 extends Sequence1 {

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
      final long c = Euler.phiAsLong(p);
      mPhiCache[pp] = c;
      return c;
    } else {
      return Euler.phiAsLong(p);
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

