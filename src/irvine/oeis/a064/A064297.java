package irvine.oeis.a064;

import irvine.math.lattice.Lattice;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046995.
 * @author Sean A. Irvine
 */
public class A064297 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    if (mM == 1) {
      return Z.ONE;
    }
    // Maximum length of such a path is mN * mM.
    // Start at (n-1,m-1) and search until we hit (0,0)
    final Lattice grid = Lattices.grid(mN, mM);
    final long[] count = {0};
    final SelfAvoidingWalker walker = new SelfAvoidingWalker(grid) {
        @Override
        protected boolean isAcceptable(final long point, final int remainingSteps) {
          if (!super.isAcceptable(point, remainingSteps)) {
            return false;
          }
          if (point == grid.origin()) {
            ++count[0];
            return false; // once we hit the origin do not continue
          }
          return true;
        }
      };
    walker.count(mN * mM, 1, 3, grid.toPoint(mN - 1, mM - 1));
    return Z.valueOf(count[0]);
  }
}
