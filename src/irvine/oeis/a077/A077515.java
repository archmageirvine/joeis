package irvine.oeis.a077;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077515 Smallest n-digit number beginning with n and having n divisors, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A077515 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final StringBuilder sbmin = new StringBuilder();
    sbmin.append(mN);
    final StringBuilder sbmax = new StringBuilder();
    sbmax.append(mN + 1);
    while (sbmin.length() < mN) {
      sbmin.append(0);
      sbmax.append(0);
    }
    final Z lim = new Z(sbmax);
    Z s = new Z(sbmin);
    if ((mN & 1) == 0) {
      while (Functions.SIGMA0.l(s) != mN) {
        s = s.add(1);
        if (s.equals(lim)) {
          return Z.ZERO;
        }
      }
      return s;
    }
    if (mPrime.isPrime(mN)) {
      // Must have form p^(k-1)
      Z r = mPrime.nextPrime(s.root(mN - 1).subtract(1));
      while (true) {
        final Z t = r.pow(mN - 1);
        if (t.compareTo(lim) >= 0) {
          return Z.ZERO;
        }
        if (t.compareTo(s) >= 0) {
          return t;
        }
        r = mPrime.nextPrime(r);
      }
    }
    // For odd n result must be a perfect square
    Z sq = s.sqrt();
    while (true) {
      sq = sq.add(1);
      final Z t = sq.square();
      if (t.compareTo(lim) >= 0) {
        return Z.ZERO;
      }
      if (Functions.SIGMA0.l(t) == mN) {
        return t;
      }
    }
  }
}
