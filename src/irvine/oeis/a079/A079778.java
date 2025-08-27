package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079778 a(n) = smallest prime number such that a(n) - n is composite.
 * @author Sean A. Irvine
 */
public class A079778 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = mPrime.nextPrime(mN + 3);
    while (mPrime.isPrime(p - mN)) {
      p = mPrime.nextPrime(p);
    }
    return Z.valueOf(p);
  }
}

