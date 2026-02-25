package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083876 Least pseudoprime to base 2 through base prime(n).
 * @author Sean A. Irvine
 */
public class A083876 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mM = 341;

  private boolean is(final long m, final long p) {
    if (mPrime.isPrime(m)) {
      return false;
    }
    for (long k = 2; k <= p; k = mPrime.nextPrime(k)) {
      if (!Z.valueOf(k).modPow(m - 1, m).isOne()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    while (!is(mM, mP)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
