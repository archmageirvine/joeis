package irvine.oeis.a087;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087243 a(n) = n + A087242(n) or a(n)=0 if A087242(n)=0; the primes arising as n + A087242(n).
 * @author Sean A. Irvine
 */
public class A087243 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 1) {
      return mPrime.isPrime(mN + 2) ? Z.valueOf(mN + 2) : Z.ZERO;
    }
    long p = 2;
    while (!mPrime.isPrime(mN + p)) {
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(mN + p);
  }
}

