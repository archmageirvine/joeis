package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.MemorySequence;

/**
 * A058974 a(n) = 0 if n = 1 or a prime, otherwise a(n) = s + a(s) iterated until no change occurs, where s (A008472) is sum of distinct primes dividing n.
 * @author Sean A. Irvine
 */
public class A058974 extends MemorySequence {

  private final Fast mPrime = new Fast();
  {
    setOffset(1);
    add(null); // 0 unused
  }

  private Z sumDistrinctPrimeFactors(final int n) {
    return ZUtils.sum(Jaguar.factor(n).toZArray());
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1 || mPrime.isPrime(n)) {
      return Z.ZERO;
    }
    final Z sopfr = sumDistrinctPrimeFactors(n);
    return sopfr.add(get(sopfr.intValueExact()));
  }
}
