package irvine.oeis.a085;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085401 a(0) = 1; a(n+1) is the smallest positive number (of at most two) such that abs(a(n) - a(n+1)) is the smallest prime not occurring earlier as difference of successive terms and a(n) + a(n+1) is composite.
 * @author Sean A. Irvine
 */
public class A085401 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Long> mSeen = new TreeSet<>();
  private long mA = 0;
  private long mLeastUnused = 2;

  @Override
  public Z next() {
    if (mA == 0) {
      mA = 1;
      return Z.ONE;
    }
    while (mSeen.remove(mLeastUnused)) {
      mLeastUnused = mPrime.nextPrime(mLeastUnused);
    }
    long p = mLeastUnused;
    while (true) {
      final long lo = mA - p;
      if (lo > 0 && !mPrime.isPrime(lo + mA)) {
        mA = lo;
        mSeen.add(p);
        return Z.valueOf(mA);
      }
      final long hi = mA + p;
      if (!mPrime.isPrime(hi + mA)) {
        mA = hi;
        mSeen.add(p);
        return Z.valueOf(mA);
      }
      p = mPrime.nextPrime(p);
    }
  }
}
