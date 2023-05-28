package irvine.oeis.a063;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063932 Average of largest prime less than or equal to n and smallest prime greater than or equal to n.
 * @author Sean A. Irvine
 */
public class A063932 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    return Z.valueOf((mPrime.nextPrime(mN++) + mPrime.prevPrime(mN + 1)) / 2);
  }
}
