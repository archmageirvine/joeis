package irvine.oeis.a084;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084736 a(1) = 2, a(2) = 3; for n &gt; 0, a(n+2) is the smallest prime chosen so that (a(n+2) - a(n+1))/(a(n+1) - a(n)) is an integer.
 * @author Sean A. Irvine
 */
public class A084736 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return Z.TWO;
      }
      mB = Z.THREE;
      return Z.THREE;
    }
    final Z d = mB.subtract(mA);
    Z p = mB;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p.subtract(mB).mod(d).isZero()) {
        mA = mB;
        mB = p;
        return p;
      }
    }
  }
}
