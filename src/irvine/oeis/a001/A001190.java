package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A001190 Wedderburn-Etherington numbers: unlabeled binary rooted trees (every node has <code>out-degree 0</code> or <code>2)</code> with n endpoints <code>(and 2n-1</code> nodes in <code>all)</code>.
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
        s = s.add(get(k).multiply(get(j)));
      }
      final Z t = get(mN / 2);
      return s.add(t.multiply(t.add(1)).divide(2));
    } else {
      Z s = Z.ZERO;
      for (int k = 1, j = size() - 1; k <= mN / 2; ++k, --j) {
        s = s.add(get(k).multiply(get(j)));
      }
      return s;
    }
  }
}
