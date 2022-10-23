package irvine.oeis.a009;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A009560 Numbers k that divide the sum of all primes &lt;= k.
 * @author Sean A. Irvine
 */
public class A009560 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      if (++mN > mP) {
        mSum = mSum.add(mP);
        mP = mPrime.nextPrime(mP);
      }
      if (mSum.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
