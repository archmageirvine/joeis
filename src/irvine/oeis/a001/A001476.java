package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001476 Numbers that are not the sum of distinct positive cubes.
 * @author Sean A. Irvine
 */
public class A001476 extends Sequence1 {

  private int mN = 1;
  private final boolean[] mExpressible = new boolean[12759];

  {
    for (int k = 1; k < 24; ++k) {
      final int u = k * k * k;
      for (int j = mExpressible.length - 1; j > 0; --j) {
        if (mExpressible[j]) {
          final int p = j + u;
          if (p < mExpressible.length) {
            mExpressible[p] = true;
          }
        }
      }
      mExpressible[u] = true;
    }
  }

  @Override
  public Z next() {
    if (mN == 12758) {
      return null;
    }
    while (mExpressible[++mN]) {
    }
    return Z.valueOf(mN);
  }
}
