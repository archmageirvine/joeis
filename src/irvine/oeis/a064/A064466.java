package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064466 a(0) = 6 and a(n) = Min { m &gt; a(n-1) | both a(n-1) - p and m - p are prime for some prime p } for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A064466 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.SIX;
      return Z.SIX;
    } else {
      Z t = mA;
      while (true) {
        t = t.add(2);
        Z p = Z.TWO;
        while (true) {
          p = mPrime.nextPrime(p);
          if (p.compareTo(mA) > 0) {
            break;
          }
          if (mPrime.isPrime(mA.subtract(p)) && mPrime.isPrime(t.subtract(p))) {
            mA = t;
            return mA;
          }
        }
      }
    }
  }
}
