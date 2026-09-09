package irvine.oeis.a086;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086519 a(n) is the least prime not already used such that (a(n)+a(n-1))/2 is prime.
 * @author Sean A. Irvine
 */
public class A086519 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private long mLeastUnused = 5;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.THREE;
      return Z.THREE;
    }
    while (mUsed.remove(mLeastUnused)) {
      mLeastUnused = mPrime.nextPrime(mLeastUnused);
    }
    long k = mLeastUnused;
    while (mUsed.contains(k) || !mA.add(k).divide2().isProbablePrime()) {
      k = mPrime.nextPrime(k);
    }
    mUsed.add(k);
    mA = Z.valueOf(k);
    return mA;
  }
}

