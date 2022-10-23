package irvine.oeis.a057;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057159 Numbers k that divide s(k-1), where s(1) = 1, s(k) = s(k-1) + (k+1)*3^k.
 * @author Sean A. Irvine
 */
public class A057159 extends Sequence1 {

  private long mN = 3;

  private boolean is0(final long n) {
    long sum = 1;
    long threes = 3;
    for (int k = 2; k < n; ++k) {
      threes *= 3;
      threes %= mN;
      sum += ((k + 1) * threes) % mN;
      sum %= mN;
    }
    return sum == 0;
  }

  private boolean is(final long n) {
    final long inv = LongUtils.modInverse(4, n);
    long a = LongUtils.modPow(3, n, n);
    a *= 2 * n - 1;
    a %= n;
    a += n - 23;
    a %= n;
    a *= inv;
    a %= n;
    return a == 0 && is0(n);
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}

