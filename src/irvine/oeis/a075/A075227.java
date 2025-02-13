package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.prime.Fast;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075227 Smallest odd prime not occurring in the numerator of any of the 2^n subset sums generated from the set 1/1, 1/2, 1/3, ..., 1/n.
 * @author Sean A. Irvine
 */
public class A075227 extends Sequence1 {

  private final Fast mFast = new Fast();
  private final Set<Q> mSums = new HashSet<>();
  {
    mSums.add(Q.ZERO);
  }
  private final Set<Z> mPrimes = new HashSet<>();
  private long mN = 0;
  private Z mP = Z.THREE;

  @Override
  public Z next() {
    final Q t = new Q(1, ++mN);
    final Set<Q> s = new HashSet<>();
    for (final Q sum : mSums) {
      final Q v = sum.add(t);
      final Z num = v.num();
      if (num.isProbablePrime()) {
        mPrimes.add(num);
      }
      s.add(v);
    }
    mSums.addAll(s);
    while (mPrimes.contains(mP)) {
      mP = mFast.nextPrime(mP);
    }
    return mP;
  }
}
