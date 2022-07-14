package irvine.oeis.a057;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002113;

/**
 * A057943 Numbers k such that the smallest palindromic pseudoprime to base k is 101101.
 * @author Sean A. Irvine
 */
public class A057943 implements Sequence {

  private static final long PALIN = 101101; // Not a prime.
  private long mN = 1;
  private final Fast mPrime = new Fast();

  private boolean is(final long base, final long palin) {
    return LongUtils.modPow(base, palin - 1, palin) == 1;
  }

  private boolean isSmallest(final long base) {
    final Sequence palins = new A002113();
    palins.next(); // skip 0
    palins.next(); // skip 1
    long p;
    while ((p = palins.next().longValueExact()) < PALIN) {
      if (!mPrime.isPrime(p) && is(base, p)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN, PALIN) && isSmallest(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
