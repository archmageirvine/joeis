package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a002.A002808;
import irvine.util.array.DynamicLongArray;

/**
 * A060343 Smallest prime which is the sum of n composite numbers.
 * @author Sean A. Irvine
 */
public class A060343 extends Sequence2 {

  private int mN = 1;
  private final DynamicLongArray mComposites = new DynamicLongArray();
  private final Sequence mC = new A002808();
  private final Fast mPrime = new Fast();
  private long mP = 13;

  private long composite(final int n) {
    while (n >= mComposites.length()) {
      mComposites.set(mComposites.length(), mC.next().longValueExact());
    }
    return mComposites.get(n);
  }

  private boolean is(final long n, final int remaining, int index) {
    if (remaining <= 0) {
      return n == 0;
    }
    while (composite(index) * remaining <= n) {
      if (is(n - composite(index), remaining - 1, index)) {
        return true;
      }
      ++index;
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mP, mN, 0)) {
      mP = mPrime.nextPrime(mP);
    }
    return Z.valueOf(mP);
  }
}
