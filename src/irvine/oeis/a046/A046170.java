package irvine.oeis.a046;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046170 Number of self-avoiding walks on a 2-D lattice of length n which start at the origin, take first step in the {+1,0} direction and whose vertices are always nonnegative in x and y.
 * @author Sean A. Irvine
 */
public class A046170 implements Sequence {

  protected final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z2) {
    @Override
    protected boolean isAcceptable(final long point, final int remainingSteps) {
      return Lattices.Z2.ordinate(point, 0) >= 0 && Lattices.Z2.ordinate(point, 1) >= 0 && super.isAcceptable(point, remainingSteps);
    }
  });
  private final long mX1 = Lattices.Z2.toPoint(1, 0);
  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mWalker.count(mN, 1, 3, Lattices.Z2.origin(), mX1));
  }
}
