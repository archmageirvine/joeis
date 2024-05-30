package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A057246 s=0; d is divisor of n [here d &lt;= n/d]; if gcd(d,n/d)=1 or gcd(d,n/d)=d then s=s+d+(n/d); [if d=n/d then s=s+d]: The sequence contains composite n for which s = 2*n.
 * @author Sean A. Irvine
 */
public class A057246 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  private boolean is(final long n) {
    long s = 0;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final long d = dd.longValueExact();
      if (d * d < n) {
        final long g = LongUtils.gcd(d, n / d);
        if (g == 1 || g == d) {
          s += d + n / d;
        }
      }
    }
    final long g = Functions.SQRT.l(n);
    if (g * g == n) {
      s += g;
    }
    return s == 2 * n;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      if (mVerbose && (mN & 0xFFFFF) == 0) {
        StringUtils.message("Search completed to n=" + mN);
      }
    }
    return Z.valueOf(mN);
  }
}
