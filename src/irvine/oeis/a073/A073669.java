package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073669 a(1) = 1, a(n) = the smallest composite multiple of n such that every partial sum is prime.
 * @author Sean A. Irvine
 */
public class A073669 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mSum = Z.ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ONE.equals(mN)) {
      return mSum;
    }
    long k = mPrime.isPrime(mN) ? 1 : 0;
    while (true) {
      final Z t = mN.multiply(++k);
      final Z s = mSum.add(t);
      if (s.isProbablePrime()) {
        mSum = s;
        return t;
      }
    }
  }
}
