package irvine.oeis.a085;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085061 a(0) = 1; a(n+1) is the largest positive number (of at most two) such that abs(a(n) - a(n+1)) is the smallest prime not occurring earlier as difference of successive terms and a(n) + a(n+1) is composite.
 * @author Sean A. Irvine
 */
public class A085061 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private final HashSet<Z> mSeenDifference = new HashSet<>();
  private Z mA = null;
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final Z a2 = mA.multiply2();
    while (mSeenDifference.remove(mP)) {
      mP = mPrime.nextPrime(mP);
    }
    Z p = mP;
    while (true) {
      if (mSeenDifference.contains(p)) {
        p = mPrime.nextPrime(p);
      } else if (!mPrime.isPrime(a2.add(p))) {
        mA = mA.add(p);
        mSeenDifference.add(p);
        return mA;
      } else if (p.compareTo(mA) < 0 && !mPrime.isPrime(a2.subtract(p))) {
        mA = mA.subtract(p);
        mSeenDifference.add(p);
        return mA;
      } else {
        p = mPrime.nextPrime(p);
      }
    }
  }
}
