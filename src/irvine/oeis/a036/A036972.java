package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000045;

/**
 * A036972 n-th prime is a Fibonacci number reversed.
 * @author Sean A. Irvine
 */
public class A036972 extends A000045 {

  private final Fast mPrime = new Fast();
  private int mN = 0;
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z r = ZUtils.reverse(super.next());
      if (r.isProbablePrime()) {
        while (mP.compareTo(r) > 0) {
          mP = mPrime.prevPrime(mP);
          --mN;
        }
        while (mP.compareTo(r) < 0) {
          mP = mPrime.nextPrime(mP);
          ++mN;
        }
        return Z.valueOf(mN);
      }
    }
  }
}

