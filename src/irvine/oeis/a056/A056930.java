package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056930 Average of smallest prime greater than n^2 and largest prime less than (n+1)^2.
 * @author Sean A. Irvine
 */
public class A056930 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    return mPrime.nextPrime(Z.valueOf(++mN).square()).add(mPrime.prevPrime(Z.valueOf(mN + 1).square())).divide2();
  }
}
