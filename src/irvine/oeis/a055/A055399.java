package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A055399 Number of stages of sieve of Eratosthenes needed to identify n as prime or composite.
 * @author Sean A. Irvine
 */
public class A055399 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    final long t = mPrime.isPrime(++mN) ? mPrime.nextPrime((int) LongUtils.sqrt(mN)) : Functions.LPF.l(mN);
    return Functions.PRIME_PI.z(t);
  }
}
