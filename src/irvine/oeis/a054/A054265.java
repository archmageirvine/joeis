package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054265 Sum of composite numbers between successive primes.
 * @author Sean A. Irvine
 */
public class A054265 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 2;

  @Override
  public Z next() {
    long sum = 0;
    while (!mPrime.isPrime(++mN)) {
      sum += mN;
    }
    return Z.valueOf(sum);
  }
}
