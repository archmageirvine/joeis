package irvine.oeis.a038;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038034 Number of compositions (ordered partitions) of 1 into {1/1, 1/2, 1/3, ..., 1/n}.
 * @author Sean A. Irvine
 */
public class A038034 extends Sequence1 {

  private int mN = 0;
  private int[] mCounts = null;
  private Z mNumCompositions = Z.ZERO;

  private void search(final Q remaining, final int den, final int parts) {
    if (remaining.isZero()) {
      mNumCompositions = mNumCompositions.add(Binomial.multinomial(parts, mCounts));
      return;
    }
    for (int d = den; d <= mN; ++d) {
      final Q v = remaining.subtract(new Q(1, d));
      if (v.signum() >= 0) {
        ++mCounts[d - 1];
        search(v, d, parts + 1);
        --mCounts[d - 1];
      }
    }
  }

  @Override
  public Z next() {
    mCounts = new int[++mN];
    mNumCompositions = Z.ZERO;
    search(Q.ONE, 1, 0);
    return mNumCompositions;
  }
}

