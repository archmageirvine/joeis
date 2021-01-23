package irvine.oeis.a016;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A016112 Smallest prime whose digit product is n, if possible; otherwise 0 if n is a prime &gt; 7 or 1 if n has a prime factor &gt; 7.
 * @author Sean A. Irvine
 */
public class A016112 implements Sequence {

  // This sequence seems a little weird.
  // a(2) = 2, a(3) = 3, a(5) = 5, and a(7) = 7,
  // seem to be disallowed as solutions for some reason.

  private long mN = -1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    if (++mN > 7 && mPrime.isPrime(mN)) {
      return Z.ZERO;
    }
    for (final Z p : Cheetah.factor(mN).toZArray()) {
      if (p.longValue() > 7) {
        return Z.ONE;
      }
    }
    long p = 7; // start at 7 so that a(2) = 211, a(3) = 13, etc.
    while (true) {
      p = mPrime.nextPrime(p);
      if (ZUtils.digitProduct(p) == mN) {
        return Z.valueOf(p);
      }
    }
  }
}
