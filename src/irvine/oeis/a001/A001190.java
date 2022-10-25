package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A001190 Wedderburn-Etherington numbers: unlabeled binary rooted trees (every node has outdegree 0 or 2) with n endpoints (and 2n-1 nodes in all).
 * @author Sean A. Irvine
 */
public class A001190 extends MemorySequence {

  protected int mN = -1;

  @Override
  protected Z computeNext() {
    if (++mN == 0) {
      return Z.ZERO;
    } else if (mN < 4) {
      return Z.ONE;
    } else if ((mN & 1) == 0) {
      Z s = Z.ZERO;
      for (int k = 1, j = size() - 1; k < mN / 2; ++k, --j) {
        s = s.add(a(k).multiply(a(j)));
      }
      final Z t = a(mN / 2);
      return s.add(t.multiply(t.add(1)).divide2());
    } else {
      Z s = Z.ZERO;
      for (int k = 1, j = size() - 1; k <= mN / 2; ++k, --j) {
        s = s.add(a(k).multiply(a(j)));
      }
      return s;
    }
  }
}
