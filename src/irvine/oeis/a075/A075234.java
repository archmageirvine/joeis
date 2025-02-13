package irvine.oeis.a075;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075234 Least k such that k^n is the smallest interprime which is an n-th power.
 * @author Sean A. Irvine
 */
public class A075234 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z kn = Z.valueOf(++k).pow(mN);
      if (mPrime.prevPrime(kn).add(mPrime.nextPrime(kn)).equals(kn.multiply2())) {
        return Z.valueOf(k);
      }
    }
  }
}
