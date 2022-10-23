package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000885 Number of twin prime pairs &lt; square of n-th prime.
 * @author Sean A. Irvine
 */
public class A000885 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private Z mN = Z.THREE;
  private long mC = 0;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final Z sq = Z.valueOf(mP).square();
    while (mN.compareTo(sq) <= 0) {
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

