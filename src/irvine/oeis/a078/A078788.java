package irvine.oeis.a078;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A078788 Smallest m such that (n-1)*m+1 mod n = 0, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A078788 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long p = 2;
    while (p < mN) {
      p = mPrime.nextPrime(p);
      if ((1 - mN) % p == 0) {
        return Z.valueOf(p);
      }
    }
    return Z.ZERO;
  }
}

