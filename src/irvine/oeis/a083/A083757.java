package irvine.oeis.a083;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083757 Primes arising in A083756.
 * @author Sean A. Irvine
 */
public class A083757 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mUsed.add(5L);
      mA = Z.FIVE;
      return Z.FIVE;
    }
    mA = mA.multiply(10);
    long lim = 10;
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p > lim) {
        mA = mA.multiply(10);
        lim *= 10;
      }
      if (!mUsed.contains(p)) {
        final Z u = mA.add(p);
        if (u.isProbablePrime()) {
          mUsed.add(p);
          mA = u;
          return mA;
        }
      }
    }
  }
}
