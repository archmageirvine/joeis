package irvine.oeis.a010;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A010051 Characteristic function of primes: 1 if n is prime, else 0.
 * @author Sean A. Irvine
 */
public class A010051 extends Sequence1 implements DirectSequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    return mPrime.isPrime(++mN) ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z a(final Z n) {
    return n.isProbablePrime() ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z a(final int n) {
    return mPrime.isPrime(n) ? Z.ONE : Z.ZERO;
  }

}

