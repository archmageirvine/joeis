package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A063933 Difference between n and the average of largest prime less than or equal to n and smallest prime greater than or equal to n.
 * @author Sean A. Irvine
 */
public class A063933 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf(++mN - (mPrime.nextPrime(mN - 1) + mPrime.prevPrime(mN + 1)) / 2);
  }
}
