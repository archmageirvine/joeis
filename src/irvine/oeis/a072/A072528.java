package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072528 Table T(n,k) read by rows, giving number of occurrences of the remainder k when n is divided by i=1,2,3,...,n.
 * @author Sean A. Irvine
 */
public class A072528 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private int[] mCounts = {};

  @Override
  public Z next() {
    if (++mM >= mCounts.length || mCounts[mM] == 0) {
      ++mN;
      mM = 0;
      mCounts = new int[mN];
      for (int k = 1; k <= mN; ++k) {
        ++mCounts[mN % k];
      }
    }
    return Z.valueOf(mCounts[mM]);
  }
}
