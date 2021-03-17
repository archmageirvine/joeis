package irvine.oeis.a038;

import java.util.Arrays;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.lattice.Walker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038592 Number of cubefree self avoiding walks in 2 dimensions of length n.
 * @author Sean A. Irvine
 */
public class A038592 implements Sequence {

  private final Walker mWalker = new SelfAvoidingWalker(Lattices.Z2) {

    private long[] word(final int end, final int l) {
      final long[] res = new long[l];
      for (int k = 0, j = end; k < l; ++k, --j) {
        res[k] = mWalk[j] - mWalk[j - 1];
      }
      return res;
    }

    private boolean isCubicFactor(final int len, final long[] factor) {
      for (int k = 0, j = len - factor.length; k < 2; ++k, j -= factor.length) {
        final long[] f = word(j, factor.length);
        if (!Arrays.equals(factor, f)) {
          return false;
        }
      }
      return true;
    }

    @Override
    protected boolean isAcceptable(final long point, final int remainingSteps) {
      if (!super.isAcceptable(point, remainingSteps)) {
        return false;
      }
      if (mN - remainingSteps < 2) {
        return true; // Trivially cube free
      }
      // Check cube free
      final int len = mN - remainingSteps + 1;
      if (len == mWalk.length) {
        return true;
      }
      mWalk[len] = point; // Assume target point is part of the path
      for (int i = 1; 3 * i <= len; ++i) {
        final long[] factor = word(len, i);
        if (isCubicFactor(len, factor)) {
          return false;
        }
      }
      return true;
    }
  };
  private final long mX1 = Lattices.Z2.toPoint(1, 0);
  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 4, 1, Lattices.Z2.origin(), mX1));
  }
}
