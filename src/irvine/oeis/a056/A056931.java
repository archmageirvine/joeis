package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A056931 Difference between n-th oblong (promic) number, n(n+1), and the average of the smallest prime greater than n^2 and the largest prime less than (n+1)^2.
 * @author Sean A. Irvine
 */
public class A056931 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.multiply(mN + 1).subtract(mPrime.nextPrime(n.square()).add(mPrime.prevPrime(Z.valueOf(mN + 1).square())).divide2());
  }
}
