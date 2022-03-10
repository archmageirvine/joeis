package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055078 Write n as a sum of terms of the form (p^2-1)/24 where p is a prime &gt; 4; sequence gives those n which require at least 4 terms.
 * @author Sean A. Irvine
 */
public class A055078 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 32;

  private boolean isNot(final long n, final int terms, final long sum, final long v) {
    if (n == sum) {
      return true;
    }
    if (terms == 3) {
      return false;
    }
    long u = v;
    long s;
    while ((s = sum + (u * u - 1) / 24) <= n) {
      if (isNot(n, terms + 1, s, u)) {
        return true;
      }
      u = mPrime.nextPrime(u);
    }
    return false;
  }

  @Override
  public Z next() {
    while (isNot(++mN, 0, 0, 5)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}

