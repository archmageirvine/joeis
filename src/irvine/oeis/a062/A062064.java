package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062064 a(1) = 2; a(n) is the smallest prime &gt; a(n-1) such that a(n) + a(n-1) is a square.
 * @author Sean A. Irvine
 */
public class A062064 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      Z p = mA;
      while (true) {
        p = mPrime.nextPrime(p);
        if (mA.add(p).isSquare()) {
          mA = p;
          break;
        }
      }
    }
    return mA;
  }
}

