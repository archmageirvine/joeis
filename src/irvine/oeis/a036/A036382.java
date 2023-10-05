package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036382 Odd split numbers: have a nontrivial factorization n=ab with a and b coprime, so that L(a) + L(b) &lt;= L(n), where L(x) = A029837(x) = ceiling(log_2(x)).
 * @author Sean A. Irvine
 */
public class A036382 extends Sequence1 {

  private long mN = 19;

  private long l(final long n) {
    return LongUtils.log2(n) + ((n & (n - 1)) == 0 ? 0 : 1);
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final long lgn = l(mN);
      for (final Z dd : Jaguar.factor(mN).divisors()) {
        final long d = dd.longValue();
        if (d != 1 && d != mN) {
          final long e = mN / d;
          if (LongUtils.gcd(d, e) == 1 && l(d) + l(e) <= lgn) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
