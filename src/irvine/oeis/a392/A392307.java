package irvine.oeis.a392;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392307 Number of composite numbers c such that c * sigma_n(c) == 2 (mod phi(c)).
 * @author Sean A. Irvine
 */
public class A392307 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    long lim = 1L << (++mN + 2) + 3;
    long p = 3;
    long cnt = 2;
    while (true) {
      p  = mPrime.nextPrime(p);
      if (p > lim) {
        return Z.valueOf(cnt);
      }
      if (mPrime.isPrime(p) && Z.TWO.modPow(mN + 2, p - 1).equals(p - 3)) {
        ++cnt;
      }
    }
  }
}

