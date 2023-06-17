package irvine.oeis.a006;

import java.util.TreeSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A006987 Binomial coefficients: C(n,k), 2 &lt;= k &lt;= n-2, sorted, duplicates removed.
 * @author Sean A. Irvine
 */
public class A006987 extends AbstractSequence {

  /** Construct the sequence. */
  public A006987() {
    super(1);
  }

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
