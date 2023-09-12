package irvine.oeis.a038;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038627 Number of solutions x to n * pi(x) = x, where pi(x) = number of primes &lt;= x.
 * @author Sean A. Irvine
 */
public class A038627 extends Sequence1 {

  // After Robert Price

  private int mN = 0;
  private double mMin = 0.5;
  private double mMax = 2;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    int cnt = 0;
    int x = (int) (mMin * 2.4);
    final double x1 = 2.7 * mMax + 7;
    mMin = Double.POSITIVE_INFINITY;
    mMax = 0;
    while (x <= x1) {
      if (x == Puma.primePi((long) mN * x)) {
        ++cnt;
        if (x < mMin) {
          mMin = x;
        }
        if (x > mMax) {
          mMax = x;
        }
      }
      ++x;
    }
    return Z.valueOf(cnt);
  }
}
