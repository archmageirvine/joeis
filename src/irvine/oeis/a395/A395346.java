package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A395346 Primes that begin a pair of consecutive primes with the same number of digits and a prime\u2011valued digit dot product.
 * @author Sean A. Irvine
 */
public class A395346 extends A000040 {

  private Z mLim = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.compareTo(mLim) >= 0) {
        mLim = mLim.multiply(10);
      }
      Z r = p;
      Z q = mPrime.nextPrime(p);
      if (q.compareTo(mLim) < 0) {
        long sum = 0;
        while (!q.isZero()) {
          final Z[] f = r.divideAndRemainder(Z.TEN);
          final Z[] g = q.divideAndRemainder(Z.TEN);
          sum += g[1].longValue() * f[1].longValue();
          r = f[0];
          q = g[0];
        }
        if (mPrime.isPrime(sum)) {
          return p;
        }
      }
    }
  }
}

