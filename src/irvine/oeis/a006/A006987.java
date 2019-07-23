package irvine.oeis.a006;

import java.util.TreeSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006987 Binomial coefficients: <code>C(n,k), 2 &lt;= k &lt;= n-2</code>, sorted, duplicates removed.
 * @author Sean A. Irvine
 */
public class A006987 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  private long mN = 2 * start();

  protected long start() {
    return 2;
  }

  @Override
  public Z next() {
    while (mPriority.isEmpty() || Binomial.binomial(mN, start()).compareTo(mPriority.first()) <= 0) {
      for (long k = start(); k <= mN / 2; ++k) {
        mPriority.add(Binomial.binomial(mN, k));
      }
      ++mN;
    }
    return mPriority.pollFirst();
  }
}
