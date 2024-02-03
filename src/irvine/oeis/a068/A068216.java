package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A067845.
 * @author Sean A. Irvine
 */
public class A068216 extends Sequence3 {

  private Z mN = Z.valueOf(10);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    mN = mN.multiply(10);
    Z t = mN.subtract(1);
    while (true) {
      t = t.add(2);
      if (!mPrime.isPrime(t) && Z.TWO.modPow(t.subtract(1), t).equals(Z.ONE)) {
        return t;
      }
    }
  }
}
