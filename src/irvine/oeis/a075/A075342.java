package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075342 a(1) = 1, a(n+1) is the smallest number such that there are n primes between a(n) and a(n+1) exclusive.
 * @author Sean A. Irvine
 */
public class A075342 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private int mN = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    ++mN;
    for (int k = 0; k < mN; ++k) {
      mA = mPrime.nextPrime(mA);
    }
    mA = mA.add(1);
    return mA;
  }
}
