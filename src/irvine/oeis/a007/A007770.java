package irvine.oeis.a007;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007770 Happy numbers: numbers whose trajectory under iteration of sum of squares of digits map (see A003132) includes 1.
 * @author Sean A. Irvine
 */
public class A007770 implements Sequence {

  private long mN = 0;
  private final long[] mCache = new long[1000000]; // Remembers the result for small values
  private final HashSet<Long> mSeen = new HashSet<>();

  private long squareDigitSum(final long n) {
    if (n < mCache.length) {
      final long r = mCache[(int) n];
      if (r != 0) {
        return r;
      }
    }
    long s = 0;
    long m = n;
    while (m != 0) {
      final long r = m % 10;
      s += r * r;
      m /= 10;
    }
    if (n < mCache.length) {
      mCache[(int) n] = s;
    }
    return s;
  }

  protected boolean isHappy(long n) {
    mSeen.clear();
    while (true) {
      if (n == 1) {
        return true;
      }
      if (!mSeen.add(n)) {
        return false; // cycles
      }
      n = squareDigitSum(n);
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (isHappy(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
