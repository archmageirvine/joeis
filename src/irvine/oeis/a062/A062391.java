package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062391 a(1) = 3, a(2) = 5; a(n+1) = smallest prime number &gt; a(n) such that the sum of any three consecutive terms is a prime.
 * @author Sean A. Irvine
 */
public class A062391 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.THREE;
        return Z.THREE;
      }
      mB = Z.FIVE;
      return Z.FIVE;
    }
    Z p = mB;
    final Z t = mA.add(mB);
    while (true) {
      p = mPrime.nextPrime(p);
      if (t.add(p).isProbablePrime()) {
        mA = mB;
        mB = p;
        return p;
      }
    }
  }
}
