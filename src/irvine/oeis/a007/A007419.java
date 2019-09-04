package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007419 Largest number not the sum of distinct <code>n-th-order</code> polygonal numbers.
 * @author Sean A. Irvine
 */
public class A007419 implements Sequence {

  private long mN = 2;

  private long polygonal(final long order, final long n) {
    return n + (order - 2) * (n * n - n) / 2;
  }

  private long sumPolygonal(final long order, final long n) {
    return n * (n + 1) * (order * n - 2 * n + 5 - order) / 6;
  }

  protected boolean check(final long order, final long n, final long limit) {
    long m = limit;
    while (polygonal(order, m) > n) {
      --m;
    }
    if (sumPolygonal(order, m) < n) {
      // Sum of all remaining polygonal numbers is less than n, hence
      // there can never be a solution down this path
      return false;
    }
    if (polygonal(order, m) == n) {
      // If n is polygonal itself then we are done
      return true;
    }
    // Otherwise try for a sum
    while (m > 0) {
      if (check(order, n - polygonal(order, m), m - 1)) {
        return true;
      }
      --m;
    }
    return false;
  }

  protected boolean isSum(final long order, final long n) {
    long m = 1;
    while (polygonal(order, m) < n) {
      ++m;
    }
    return check(order, n, m);
  }

  @Override
  public Z next() {
    ++mN;
    long k = 2 * mN - 2;
    long lower = k;
    long upper = 2 * k + 2;
    while (upper > lower) {
      if (isSum(mN, upper)) {
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
