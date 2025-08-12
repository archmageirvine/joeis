package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a039.A039997;

/**
 * A079066 "Memory" of prime(n): the number of distinct (previous) primes contained as substrings in prime(n).
 * @author Sean A. Irvine
 */
public class A079066 extends A039997 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Functions.PRIME_MEMORY.z(mP).subtract(1);
  }
}

