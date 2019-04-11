package irvine.oeis.a113;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A113572 Least n-digit multiple of n such that the r-th digit is prime if r is a prime else it is composite. The location and value of the most significant digit is <code>1. 0</code> if no such number exists.
 * @author Sean A. Irvine
 */
public class A113572 implements Sequence {

  private final Fast mPrime = new Fast();
  protected int mN = 0;

  private boolean test(Z v, final int len) {
    for (int k = 1, j = len; k < len; ++k, --j) {
      final int d = (int) v.mod(10);
      if (d <= 1 || mPrime.isPrime(j) ^ mPrime.isPrime(d)) {
        return false;
      }
      v = v.divide(10);
    }
    return true;
  }

  private Z computeStartPoint(final int n) {
    final StringBuilder sb = new StringBuilder("1");
    for (int k = 2; k <= n; ++k) {
      sb.append(mPrime.isPrime(k) ? "2" : "4");
    }
    final Z b = new Z(sb);
    return b.add(n - 1).divide(n).multiply(n);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN % 5 == 0 && mN != 5) {
      // If n = 5*t, t>1, then k*n can only ever end in 5 or 0, yet
      // we require this position to be a composite, which is impossible
      return Z.ZERO;
    }
    Z v = computeStartPoint(mN);
    final Z limit = v.multiply2();
    while (v.compareTo(limit) < 0) {
      if (test(v, mN)) {
        return v;
      }
      v = v.add(mN);
    }
    return Z.ZERO;
  }
}
