package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391496 a(n) is the smallest k which has exactly 2*n divisors d such that tau(k) = tau(k/d + d).
 * @author Sean A. Irvine
 */
public class A391496 extends Sequence0 {

  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    long k = 0;
    while (true) {
      final long s0 = Functions.SIGMA0.l(++k);
      int cnt = 0;
      for (final Z dd : Jaguar.factor(k).divisors()) {
        final long d = dd.longValue();
        if (Functions.SIGMA0.l(k / d + d) == s0 && ++cnt > mN) {
          break;
        }
      }
      if (cnt == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
