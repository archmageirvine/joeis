package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079950 Triangle of n-th prime modulo twice primes less n-th prime.
 * @author Sean A. Irvine
 */
public class A079950 extends A000040 {

  private Z mP = Z.ONE;
  private Z mQ = Z.ONE;

  @Override
  public Z next() {
    mQ = mPrime.nextPrime(mQ);
    if (mQ.compareTo(mP) > 0) {
      mP = super.next();
      mQ = Z.TWO;
    }
    return mP.mod(mQ.multiply2());
  }
}
