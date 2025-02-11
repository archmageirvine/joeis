package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A075169.
 * @author Sean A. Irvine
 */
public class A075226 extends Sequence2 {

  private final Set<Q> mSums = new HashSet<>();
  {
    mSums.add(Q.ZERO);
    mSums.add(Q.ONE);
  }
  private Z mLargestPrime = Z.ZERO;
  private long mN = 1;

  @Override
  public Z next() {
    final Q t = new Q(1, ++mN);
    final Set<Q> s = new HashSet<>();
    for (final Q sum : mSums) {
      final Q v = sum.add(t);
      final Z num = v.num();
      if (num.compareTo(mLargestPrime) > 0 && num.isProbablePrime()) {
        mLargestPrime = num;
      }
      s.add(v);
    }
    mSums.addAll(s);
    return mLargestPrime;
  }
}
