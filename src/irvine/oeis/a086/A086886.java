package irvine.oeis.a086;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086886 Ljungstrand's sequence: number of distinct solutions to n = (X + 1/x)(Y + 1/y), where x,y &gt; 1 and X,Y are integers.
 * @author Sean A. Irvine
 */
public class A086886 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      for (long x = 1; x * x <= mN; ++x) {
        for (final Z kk : Jaguar.factor(d + x).divisors()) {
          final long k = kk.longValue();
          if (Functions.GCD.l(mN - k, x) != x || Functions.GCD.l(mN / d + (mN - k) / x, k) != k) {
            continue;
          }
          final long y = (mN - k) / x;
          final long lx = (mN / d + (mN - k) / x) / k;
          final long ly = (d + x) / k;
          if (lx == 1 || ly == 1) {
            continue;
          }
          cnt += x == y ? 1 : 2;
        }
      }
    }
    return Z.valueOf(cnt / 2);
  }
}
