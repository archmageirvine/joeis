package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020641 a(n)-th prime is sum of first k primes for some k.
 * @author Sean A. Irvine
 */
public class A020641 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ZERO;
  private Z mP = Z.ONE;
  private Z mQ = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      mA = mA.add(mP);
      while (mQ.compareTo(mA) < 0) {
        mQ = mPrime.nextPrime(mQ);
        ++mN;
      }
      if (mQ.equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
