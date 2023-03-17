package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062016 Numbers with all odd digits which can be factored into two numbers &gt; 1 with odd digits.
 * @author Sean A. Irvine
 */
public class A062016 extends Sequence1 {

  private long mN = 4;
  private long mLim = 10;

  @Override
  public Z next() {
    while (true) {
      // Treat mN as base 5 and scale up each digit by *2+1 to get odd digits decimal numbers
      if (++mN == mLim) {
        mLim *= 5;
        mN = mLim / 2;
      }
      long m = mN;
      long t = 1;
      long n = 0;
      while (m != 1) {
        n += (2 * (m % 5) + 1) * t;
        t *= 10;
        m /= 5;
      }
      // Check for an acceptable factorization
      for (final Z dd : Jaguar.factor(n).divisorsSorted()) {
        final long d = dd.longValue();
        if (d > 1) {
          if (2 * d > n) {
            break;
          }
          if ((LongUtils.syndrome(d) & 0b0101010101) == 0 && (LongUtils.syndrome(n / d) & 0b0101010101) == 0) {
            return Z.valueOf(n);
          }
        }
      }
    }
  }
}
