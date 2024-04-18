package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068101 a(n) = Sum_{k|n, k&lt;=sqrt(n)} mu(k) where mu(k) is the Moebius function and the sum is over the positive divisors k of n with k &lt;= sqrt(n).
 * @author Sean A. Irvine
 */
public class A068101 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long sum = 0;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      final long dd = d.longValue();
      if (dd * dd <= mN) {
        sum += Functions.MOBIUS.i(dd);
      }
    }
    return Z.valueOf(sum);
  }
}

