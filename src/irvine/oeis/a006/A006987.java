package irvine.oeis.a006;

import java.util.TreeSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006987.
 * @author Sean A. Irvine
 */
public class A006987 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  private long mN = 4;

  @Override
  public Z next() {
    while (mPriority.isEmpty() || Binomial.binomial(mN, 2).compareTo(mPriority.first()) <= 0) {
      for (long k = 2; k <= mN / 2; ++k) {
        mPriority.add(Binomial.binomial(mN, k));
      }
      ++mN;
    }
    return mPriority.pollFirst();
  }
}
