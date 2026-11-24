package irvine.oeis.a087;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087525 Greater members in pairs of primes (p,q) such that p-q does not divide p+q.
 * @author Sean A. Irvine
 */
public class A087525 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mZ = 2;
  private long mY = 1;

  @Override
  public Z next() {
    while (true) {
      mY = mPrime.nextPrime(mY);
      if (mY >= mZ) {
        mZ = mPrime.nextPrime(mZ);
        mY = 2;
      }
      final long v1 = mZ - mY;
      final long v2 = mZ + mY;
      if (v2 % v1 != 0) {
        return Z.valueOf(mZ);
      }
    }
  }
}
