package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A055233 Composite numbers equal to the sum of the primes from their smallest prime factor to their largest prime factor.
 * @author Sean A. Irvine
 */
public class A055233 extends A002808 {

  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      final Z[] t = Jaguar.factor(n).toZArray();
      long sum = 0;
      for (long p = t[0].longValueExact(); p <= t[t.length - 1].longValueExact(); p = mPrime.nextPrime(p)) {
        sum += p;
      }
      if (Z.valueOf(sum).equals(n)) {
        return n;
      }
    }
  }
}
