package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007419 Largest number not the sum of distinct n-th-order polygonal numbers.
 * @author Sean A. Irvine
 */
public class A007419 implements Sequence {

  private long mN = 2;

  private long polygonal(final long order, final long n) {
    return n + (order - 2) * (n * n - n) / 2;
  }

  private boolean isSum(final long order, final long n, final long limit) {
    long m = 1;
    while (polygonal(order, m) < n) {
      ++m;
    }
    if (polygonal(order, m) == n) {
      // If n is polygonal itself then we are done
      return m <= limit;
    }
    // Otherwise try for a sum
    for (m = Math.min(m - 1, limit); m > 0; --m) {
      if (isSum(order, n - polygonal(order, m), m - 1)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 2 * mN - 2;
    long lower = k;
    long upper = 2 * k + 2;
    while (upper > lower) {
      if (isSum(mN, upper, Integer.MAX_VALUE)) {
        --upper;
      } else {
        lower = 2 * k + 2;
        k = upper;
        upper = 2 * k + 2;
      }
    }
    return Z.valueOf(k);
  }
}
