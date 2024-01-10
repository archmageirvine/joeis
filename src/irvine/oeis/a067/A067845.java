package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A067845 Largest n-digit pseudoprime (to base 2).
 * @author Sean A. Irvine
 */
public class A067845 extends Sequence3 {

  private Z mN = Z.valueOf(100);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mN = mN.multiply(10);
    Z t = mN.add(1);
    while (true) {
      t = t.subtract(2);
      if (!mPrime.isPrime(t) && Z.TWO.modPow(t.subtract(1), t).equals(Z.ONE)) {
        return t;
      }
    }
  }
}
