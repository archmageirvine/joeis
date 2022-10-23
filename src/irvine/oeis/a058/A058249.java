package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058249 (Smallest prime &gt;= 2^n) - (largest prime &lt;= 2^n).
 * @author Sean A. Irvine
 */
public class A058249 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply2();
    return Z.TWO.equals(mA) ? Z.ZERO : mPrime.nextPrime(mA).subtract(mPrime.prevPrime(mA));
  }
}
