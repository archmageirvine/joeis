package irvine.oeis.a049;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049462 a(n) is the smallest n-digit prime p such that the concatenation a(1)a(2)...a(n-1)p is prime, with a(1) = 2.
 * @author Sean A. Irvine
 */
public class A049462 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final StringBuilder mS = new StringBuilder();
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(10);
    Z p = mA;
    while (true) {
      p = mPrime.nextPrime(p);
      final String t = mS.toString() + p;
      if (new Z(t).isProbablePrime()) {
        mS.append(p);
        return p;
      }
    }
  }
}
