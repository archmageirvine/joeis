package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068164 Smallest prime obtained from n by inserting zero or more decimal digits.
 * @author Sean A. Irvine
 */
public class A068164 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  private Z search1(final long n) {
    final long r = n % 10;
    if (r == 5 || (r & 1) == 0) {
      // Only possible is to add 1, 3, 7, 9 as last digit
      if (mPrime.isPrime(10 * n + 1)) {
        return Z.valueOf(10 * n + 1);
      }
      if (mPrime.isPrime(10 * n + 3)) {
        return Z.valueOf(10 * n + 3);
      }
      if (mPrime.isPrime(10 * n + 7)) {
        return Z.valueOf(10 * n + 7);
      }
      if (mPrime.isPrime(10 * n + 9)) {
        return Z.valueOf(10 * n + 9);
      }
      return null;
    }
    final String s = String.valueOf(n);
    Z min = null;
    for (int k = 0; k <= s.length(); ++k) {
      final String left = s.substring(0, k);
      final String right = s.substring(k);
      for (int digit = k == 0 ? 1 : 0; digit <= 9; ++digit) {
        final String t = left + digit + right;
        final Z v = new Z(t);
        if (mPrime.isPrime(v) && (min == null || v.compareTo(min) < 0)) {
          min = v;
        }
      }
    }
    return min;
  }

  private Z min(final Z a, final Z b) {
    if (a == null) {
      return b;
    }
    if (b == null) {
      return a;
    }
    return a.min(b);
  }

  private Z search2(final long n) {
    final long r = mN % 10;
    if (r == 5 || (r & 1) == 0) {
      // Only possible is to add 1, 3, 7, 9 as last digit
      final Z a1 = search1(10 * n + 1);
      final Z a3 = search1(10 * n + 3);
      final Z a7 = search1(10 * n + 7);
      final Z a9 = search1(10 * n + 9);
      return min(a1, min(a3, min(a7, a9)));
    }
    final String s = String.valueOf(n);
    Z min = null;
    for (int k = 0; k <= s.length(); ++k) {
      final String left = s.substring(0, k);
      for (int j = k; j <= s.length(); ++j) {
        final String mid = s.substring(k, j);
        final String right = s.substring(j);
        for (int d1 = k == 0 ? 1 : 0; d1 <= 9; ++d1) {
          for (int d2 = 0; d2 <= 9; ++d2) {
            final String t = left + d1 + mid + d2 + right;
            final Z v = new Z(t);
            if (mPrime.isPrime(v) && (min == null || v.compareTo(min) < 0)) {
              min = v;
            }
          }
        }
      }
    }
    return min;
  }

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return Z.valueOf(mN);
    }
    final Z search1 = search1(mN);
    if (search1 != null) {
      return search1;
    }
    final Z search2 = search2(mN);
    if (search2 != null) {
      return search2;
    }
    throw new UnsupportedOperationException();
  }
}
