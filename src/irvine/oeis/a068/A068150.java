package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068150 First of n consecutive primes == 7 mod 10.
 * @author Sean A. Irvine
 */
public class A068150 extends A000040 {

  private int mN = 0;
  private Z mP = super.next();

  private boolean is(final Z p) {
    Z q = p;
    for (int k = 1; k < mN; ++k) {
      q = mPrime.nextPrime(q);
      if (q.mod(10) != 7) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mP.mod(10) == 7 && is(mP)) {
        return mP;
      }
      mP = super.next();
    }
  }
}
