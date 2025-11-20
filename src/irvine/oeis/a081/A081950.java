package irvine.oeis.a081;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081950 Smallest triangular number k such that k-1 has exactly n (not necessarily distinct) prime factors.
 * @author Sean A. Irvine
 */
public class A081950 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mMin = null;

  private void search(final Z prod, final long prev, final long remaining) {
    if (remaining <= 0) {
      if (prod.compareTo(mMin) < 0 && Predicates.TRIANGULAR.is(prod.add(1))) {
        mMin = prod;
      }
      return;
    }
    long k = prev;
    while (true) {
      final Z u = prod.multiply(Z.valueOf(k).pow(remaining));
      if (u.compareTo(mMin) >= 0) {
        break;
      }
      final Z pr = prod.multiply(k);
      search(pr, k, remaining - 1);
      k = mPrime.nextPrime(k);
    }
  }

  @Override
  public Z next() {
    ++mN;
    final Z upper = Z.TWO.pow(2 * mN);
    mMin = upper;
    search(Z.ONE, 2, mN);
    if (mMin.equals(upper)) {
      throw new UnsupportedOperationException();
    }
    return mMin.add(1);
  }
}
