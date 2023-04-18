package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A063036 Difference between average of smallest prime greater than n^3 and largest prime less than (n+1)^3 and n-th pronic [=n(n+1)].
 * @author Sean A. Irvine
 */
public class A063036 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    return mPrime.nextPrime(Z.valueOf(mN).pow(3)).add(mPrime.prevPrime(Z.valueOf(mN + 1).pow(3))).divide2().subtract(mN * (mN + 1));
  }
}
