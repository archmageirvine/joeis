package irvine.oeis.a323;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A323189 Number of n-step point-symmetrical self-avoiding walks on the square lattice.
 * @author Sean A. Irvine
 */
public class A323189 implements Sequence {

  private final long mX1 = Lattices.Z2.toPoint(1, 0);

  protected final ParallelWalker mEven180 = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z2) {
    @Override
    protected boolean contains(final long point, final int remainingSteps) {
      if (super.contains(point, remainingSteps)) {
        return true;
      }
      final long x = Lattices.Z2.ordinate(point, 0);
      final long y = Lattices.Z2.ordinate(point, 1);
      return super.contains(Lattices.Z2.toPoint(-x, -y), remainingSteps);
    }
  });

  protected final ParallelWalker mOdd180 = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z2) {

    @Override
    protected boolean contains(final long point, final int remainingSteps) {
      if (super.contains(point, remainingSteps)) {
        return true;
      }
      final long x = Lattices.Z2.ordinate(point, 0);
      final long y = Lattices.Z2.ordinate(point, 1);
      return super.contains(Lattices.Z2.toPoint(1 - x, -y), remainingSteps);
    }
  });

  private int mN = 0;

  @Override
  public Z next() {
    return (++mN & 1) == 0
      ? Z.valueOf(mEven180.count(mN / 2, 4, -1, Lattices.Z2.origin(), mX1))
      : Z.valueOf(mOdd180.count((mN + 1) / 2, 4, -1, Lattices.Z2.origin(), mX1));
  }
}
