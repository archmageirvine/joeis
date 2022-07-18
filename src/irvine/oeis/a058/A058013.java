package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058013 Smallest prime p such that (n+1)^p - n^p is prime.
 * @author Sean A. Irvine
 */
public class A058013 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    final Z a = mN;
    mN = mN.add(1);
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (mN.pow(p).subtract(a.pow(p)).isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
