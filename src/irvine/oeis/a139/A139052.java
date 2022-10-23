package irvine.oeis.a139;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A139052 Array read by rows: row n lists the first two primes with n digits.
 * @author Sean A. Irvine
 */
public class A139052 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mB = null;
  private Z mS = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mS == null) {
        mB = Z.THREE;
        mS = Z.ONE;
        return Z.TWO;
      }
      mS = mS.multiply(10);
      final Z r = mPrime.nextPrime(mS);
      mB = mPrime.nextPrime(r);
      return r;
    } else {
      final Z r = mB;
      mB = null;
      return r;
    }
  }
}

