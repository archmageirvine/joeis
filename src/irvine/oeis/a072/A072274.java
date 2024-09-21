package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a069.A069567;

/**
 * A072274 List of Ormiston prime pairs.
 * @author Sean A. Irvine
 */
public class A072274 extends A069567 {

  private final Fast mPrime = new Fast();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = super.next();
      return mA;
    } else {
      final Z res = mPrime.nextPrime(mA);
      mA = null;
      return res;
    }
  }
}
