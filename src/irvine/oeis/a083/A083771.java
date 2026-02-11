package irvine.oeis.a083;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083771 Rearrangement of primes such that every partial product + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A083771 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return mA;
    }
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if (!mUsed.contains(p)) {
        final Z u = mA.multiply(p);
        if (u.add(1).isProbablePrime()) {
          mUsed.add(p);
          mA = u;
          return Z.valueOf(p);
        }
      }
    }
  }
}
