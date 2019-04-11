package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000882 Number of twin prime pairs <code>&lt;=</code> product of first n primes.
 * @author Sean A. Irvine
 */
public class A000882 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mProduct = Z.ONE;
  private long mP = 1;
  private Z mN = Z.THREE;
  private long mC = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mProduct = mProduct.multiply(mP);
    while (mN.compareTo(mProduct) <= 0) {
      final Z v = mPrime.nextPrime(mN);
      if (v.subtract(mN).equals(Z.TWO)) {
        ++mC;
      }
      mN = v;
    }
    final int correction = mN.subtract(mPrime.prevPrime(mN)).equals(Z.TWO) ? 1 : 0;
    return Z.valueOf(mC - correction);
  }
}

