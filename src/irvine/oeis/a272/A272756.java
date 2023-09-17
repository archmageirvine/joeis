package irvine.oeis.a272;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A272756 a(n) is the least k such that k &gt; A070939(n * k).
 * @author Sean A. Irvine
 */
public class A272756 extends Sequence1 {

  private long mN = 0;
  private long mK = 1;

  private long a070939(final long n) {
    return LongUtils.lg(n) + 1;
  }

  @Override
  public Z next() {
    ++mN;
    while (mK <= a070939(mN * mK)) {
      ++mK;
    }
    return Z.valueOf(mK);
  }
}
