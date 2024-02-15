package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A068435 Consecutive prime powers without a prime between them.
 * @author Sean A. Irvine
 */
public class A068435 extends A025475 {

  private Z mB = null;
  private Z mA = super.next();

  @Override
  public Z next() {
    if (mB != null) {
      final Z t = mB;
      mB = null;
      return t;
    }
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mPrime.nextPrime(t).compareTo(mA) > 0) {
        mB = mA;
        return t;
      }
    }
  }
}

