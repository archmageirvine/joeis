package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A081413 a(n) is the smallest prime p such that the largest prime divisor of the difference nextprime(p) - p equals the n-th prime, prime(n).
 * @author Sean A. Irvine
 */
public class A081413 extends A000040 {

  @Override
  public Z next() {
    final long q = super.next().longValueExact();
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if (Functions.GPF.l(mPrime.nextPrime(p) - p) == q) {
        return Z.valueOf(p);
      }
    }
  }
}

