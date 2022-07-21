package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A058043 a(n) = nextprime(n^2) - prevprime(n^2).
 * @author Sean A. Irvine
 */
public class A058043 extends A000290 {

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
