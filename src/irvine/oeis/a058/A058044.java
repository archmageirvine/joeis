package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A058044 Difference between the smallest prime following and largest prime preceding n-th primorial number.
 * @author Sean A. Irvine
 */
public class A058044 extends A002110 {

  private final Fast mPrime = new Fast();
  {
    super.next(); // 0
    super.next(); // 1
  }

  @Override
  public Z next() {
    final Z sq = super.next();
    return mPrime.nextPrime(sq).subtract(mPrime.prevPrime(sq));
  }
}
