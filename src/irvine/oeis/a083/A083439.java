package irvine.oeis.a083;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A083439 a(1) = 3; then a(n+1) = smallest prime not already in the sequence such that the concatenations a(n)a(n+1) and a(n+1)a(n) are both primes.
 * @author Sean A. Irvine
 */
public class A083439 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    }
    Z u = Z.ONE;
    while (u.compareTo(mA) <= 0) {
      u = u.multiply(10);
    }
    Z t = mA.multiply(10);
    long lim = 10;
    long p = 2;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p > lim) {
        lim *= 10;
        t = t.multiply(10);
      }
      if (!mUsed.contains(p) && t.add(p).isProbablePrime() && u.multiply(p).add(mA).isProbablePrime()) {
        mUsed.add(p);
        mA = Z.valueOf(p);
        return mA;
      }
    }
  }
}
