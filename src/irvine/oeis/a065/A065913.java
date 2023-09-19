package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058013 Smallest prime p such that (n+1)^p - n^p is prime.
 * @author Sean A. Irvine
 */
public class A065913 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    final Z a = mN;
    mN = mN.add(1);
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final Z t = mN.pow(p).subtract(a.pow(p));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
