package irvine.oeis.a010;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010051 Characteristic function of primes: 1 if n is prime, else 0.
 * @author Sean A. Irvine
 */
public class A010051 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return mPrime.isPrime(++mN) ? Z.ONE : Z.ZERO;
  }
}

