package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064395 Primes p for which the exponent of the highest power of 2 dividing p! is equal to prevprime(p).
 * @author Sean A. Irvine
 */
public class A064395 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mExp = 0;
  private long mN = 0;
  private long mP = 2;
  private long mQ = 3;

  @Override
  public Z next() {
    while (true) {
      long s = ++mN;
      while ((s & 1) == 0) {
        ++mExp;
        s >>>= 1;
      }
      if (mN > mQ) {
        mP = mQ;
        mQ = mPrime.nextPrime(mQ);
      }
      if (mExp == mP && mN == mQ) {
        return Z.valueOf(mN);
      }
    }
  }
}

