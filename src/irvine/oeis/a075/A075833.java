package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A075833 a(n) is the least k such that for any p prime dividing n, p does not divide binomial((n+1)*k, k+1), or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A075833 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  private boolean is(final long[] primes, final long k) {
    final long u = (mN + 1) * k;
    for (final long p : primes) {
      if (Binomial.binomial(u, k + 1, p) == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final long[] p = ZUtils.toLong(Jaguar.factor(++mN).toZArray());
    long k = 0;
    while (true) {
      if (is(p, ++k)) {
        return Z.valueOf(k);
      }
      if (mVerbose && k % 1000000 == 0) {
        StringUtils.message("n=" + mN + " search completed to k=" + k);
      }
    }
  }
}
