package irvine.oeis.a039;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A039996 Number of distinct primes embedded in prime(n) as substrings.
 * @author Sean A. Irvine
 */
public class A039996 extends A039997 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Functions.PRIME_MEMORY.z(mP);
  }
}

