package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A014489 Positions of involutions (permutations whose square is the identity) in reverse colexicographic order (A055089/A195663).
 * @author Sean A. Irvine
 */
public class A014489 implements Sequence {

  private int mN = 0;
  private long mM = 0;
  private Permutation mPerm = new Permutation(1);

  private boolean isInvolution(final int[] p) {
    for (int k = 0; k < p.length; ++k) {
      if (p[p[k]] != k) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ZERO;
    }
    while (true) {
      int[] p;
      if ((p = mPerm.next()) == null) {
        final int[] e = new int[++mN];
        for (int k = 0; k < e.length; ++k) {
          e[k] = mN - 1 - k;
        }
        mPerm = new Permutation(e);
        p = mPerm.next();
      }
      if (p[0] != 0) {
        final int[] q = new int[p.length];
        for (int k = 0; k < p.length; ++k) {
          q[mN - 1 - k] = mN - p[k] - 1;
        }
        ++mM;
        if (isInvolution(q)) {
          return Z.valueOf(mM);
        }
      }
    }
  }
}
