package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061836 a(n) = smallest k&gt;0 such that k+n divides k!.
 * @author Sean A. Irvine
 */
public class A061836 extends Sequence0 {

  private long mN = -1;

  private boolean is(final long k, final long mod) {
    long f = 1 % mod;
    for (long j = 2; j <= k && f != 0; ++j) {
      f *= j;
      f %= mod;
    }
    return f == 0;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (is(++k, mN + k)) {
        return Z.valueOf(k);
      }
    }
  }
}

