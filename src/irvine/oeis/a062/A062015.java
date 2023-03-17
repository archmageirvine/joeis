package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062015 Numbers with all even digits which can be factored into two numbers with all even digits.
 * @author Sean A. Irvine
 */
public class A062015 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ZERO;
    }
    while (true) {
      // Treat mN as base 5 and scale up each digit by *2 to get even digits decimal numbers
      long m = ++mN;
      long t = 2;
      long n = 0;
      while (m != 0) {
        n += (m % 5) * t;
        t *= 10;
        m /= 5;
      }
      // Check for an acceptable factorization
      for (final Z dd : Jaguar.factor(n).divisorsSorted()) {
        final long d = dd.longValue();
        if (2 * d > n) {
          break;
        }
        if ((LongUtils.syndrome(d) & 0b1010101010) == 0 && (LongUtils.syndrome(n / d) & 0b1010101010) == 0) {
          return Z.valueOf(n);
        }
      }
    }
  }
}
