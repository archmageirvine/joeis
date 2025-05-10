package irvine.oeis.a383;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A383591 Smallest prime p where the absolute difference of the gaps to the adjacent primes exceeds n*log(p).
 * @author Sean A. Irvine
 */
public class A383591 extends A000040 {

  private long mN = 0;
  private Z mP = Z.THREE;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      final Z leftGap = mP.subtract(mPrime.prevPrime(mP));
      final Z rightGap = mPrime.nextPrime(mP).subtract(mP);
      final Z delta = rightGap.subtract(leftGap).abs();
      if (CR.valueOf(delta).compareTo(CR.valueOf(mP).log().multiply(mN)) > 0) {
        return mP;
      }
      mP = mPrime.nextPrime(mP);
    }
  }
}

