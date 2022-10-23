package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A056929 Difference between n^2 and average of smallest prime greater than n^2 and largest prime less than n^2.
 * @author Sean A. Irvine
 */
public class A056929 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    return n2.subtract(mPrime.nextPrime(n2).add(mPrime.prevPrime(n2)).divide2());
  }
}
