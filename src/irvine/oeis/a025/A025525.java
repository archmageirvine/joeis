package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025525 Largest number that is not the sum of distinct numbers of form k^2 + n.
 * @author Sean A. Irvine
 */
public class A025525 implements Sequence {

  private long mN = 0;

  private long f(final long order, final long n) {
    return n * n + order;
  }

  private long sum(final long order, final long n) {
    return (n + 1) * (2 * n * n + n + 6 * order) / 6;
  }

  protected boolean check(final long order, final long n, final long limit) {
    long m = limit;
    while (m >= 0 && f(order, m) > n) {
      --m;
    }
    if (m < 0) {
      return false;
    }
    if (sum(order, m) < n) {
      // Sum of all remaining numbers is less than n, hence
      // there can never be a solution down this path
      return false;
    }
    if (f(order, m) == n) {
      return true;
    }
    // Otherwise try for a sum
    while (m > 0) {
      if (check(order, n - f(order, m), m - 1)) {
        return true;
      }
      --m;
    }
    return false;
  }

  protected boolean isSum(final long order, final long n) {
    long m = 1;
    while (f(order, m) < n) {
      ++m;
    }
    return check(order, n, m);
  }

  @Override
  public Z next() {
    ++mN;
    long last = 20;
    long k = last;
    do {
      if (!isSum(mN, ++k)) {
        last = k;
      }
    } while (k < 2 * last + 2); // heuristic
    return Z.valueOf(last);
  }
}
