package irvine.oeis.a052;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052286 Primes p such that f(p) &gt; f(q) for all q &lt; p, where f(n) is the sum of factorials of the digits of n if that sum is the square of a prime, otherwise f(n)=0.
 * @author Sean A. Irvine
 */
public class A052286 extends A000040 {

  private static final long[] FACTORIAL = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

  private long mMax = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      Z m = p;
      long sum = 0;
      while (!m.isZero()) {
        final Z[] qr = m.divideAndRemainder(Z.TEN);
        sum += FACTORIAL[qr[1].intValue()];
        m = qr[0];
      }
      final long s = LongUtils.sqrt(sum);
      if (s * s == sum && s > mMax && Z.valueOf(s).isProbablePrime()) {
        mMax = s;
        return p;
      }
    }
  }
}
