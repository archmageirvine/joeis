package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a246.A246547;

/**
 * A067861.
 * @author Sean A. Irvine
 */
public class A067871 extends A246547 {

  private final Fast mPrime = new Fast();
  private Z mA = super.next();

  @Override
  public Z next() {
    Z b = mA;
    mA = super.next();
    long cnt = 0;
    while ((b = mPrime.nextPrime(b)).compareTo(mA) < 0) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
