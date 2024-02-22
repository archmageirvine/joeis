package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068519 If n is prime then a(n) = n, else a(n) = prime(n).
 * @author Sean A. Irvine
 */
public class A068519 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return Z.valueOf(mPrime.isPrime(++mN) ? mN : mP);
  }
}

