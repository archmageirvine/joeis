package irvine.oeis.a007;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007770.
 * @author Sean A. Irvine
 */
public class A007770 implements Sequence {

  private long mN = 0;
  private final long[] mCache = new long[1000000]; // Remembers the result for small values

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

  @Override
  public Z next() {
    final HashSet<Long> seen = new HashSet<>();
    while (true) {
      long n = ++mN;
      seen.clear();
      while (true) {
        if (n == 1) {
          return Z.valueOf(mN);
        }
        if (!seen.add(n)) {
          break; // cycles
        }
        n = squareDigitSum(n);
      }
    }
  }
}
