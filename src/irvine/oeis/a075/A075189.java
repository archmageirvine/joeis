package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075169.
 * @author Sean A. Irvine
 */
public class A075189 extends Sequence1 {

  private final Set<Q> mSums = new HashSet<>();
  {
    mSums.add(Q.ZERO);
  }
  private final Set<Z> mPrimes = new HashSet<>();
  private long mN = 0;

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
    return Z.valueOf(mPrimes.size());
  }
}
