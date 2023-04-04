package irvine.oeis.a062;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A062559 A B2 sequence consisting of powers of primes but not primes: a(n) = least value from A025475 such that sequence increases and pairwise sums of distinct elements are all distinct.
 * @author Sean A. Irvine
 */
public class A062559 extends A025475 {

  private final HashSet<Z> mTerms = new HashSet<>();
  private final HashSet<Z> mSums = new HashSet<>();
  {
    super.next();
  }

  private boolean isOk(final Z n) {
    for (final Z a : mTerms) {
      if (mSums.contains(a.add(n))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (isOk(t)) {
        for (final Z a : mTerms) {
          mSums.add(a.add(t));
        }
        mTerms.add(t);
        return t;
      }
    }
  }
}

