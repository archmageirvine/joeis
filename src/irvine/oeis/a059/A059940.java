package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059940 Smallest prime p such that x = n is a solution mod p of x^3 = 2, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A059940 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    long p = ++mN;
    while (true) {
      p = mPrime.nextPrime(p);
      if (LongUtils.modPow(mN, 3, p) == 2) {
        return Z.valueOf(p);
      }
    }
  }
}
