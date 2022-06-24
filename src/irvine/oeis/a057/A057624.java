package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057624 Initial prime in first sequence of n primes congruent to 1 modulo 4.
 * @author Sean A. Irvine
 */
public class A057624 extends A000040 {

  private int mN = 0;
  private Z mP = super.next();

  private boolean is(final Z p) {
    Z q = p;
    for (int k = 1; k < mN; ++k) {
      q = mPrime.nextPrime(q);
      if (q.mod(4) != 1) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mP.mod(4) == 1 && is(mP)) {
        return mP;
      }
      mP = super.next();
    }
  }
}
