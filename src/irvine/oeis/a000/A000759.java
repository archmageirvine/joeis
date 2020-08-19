package irvine.oeis.a000;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000759 Number of <code>n-step self-avoiding</code> walks on cubic lattice ending at point with <code>x=0</code>.
 * @author Sean A. Irvine
 */
public class A000759 implements Sequence {

  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z3),
    () -> new SelfAvoidingWalker(Lattices.Z3) {
      {
        setAccumulator((walk, weight, axesMask) -> {
          if (mLattice.ordinate(walk[walk.length - 1], 0) == targetX()) {
            increment(weight);
          }
        });
      }

      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        return super.isAcceptable(point, remainingSteps) && Math.abs(mLattice.ordinate(point, 0) - targetX()) <= remainingSteps;
      }
    });
  private final long mX = Lattices.Z3.toPoint(1, 0, 0);
  private final long mXN = Lattices.Z3.toPoint(-1, 0, 0);
  private final long mY = Lattices.Z3.toPoint(0, 1, 0);
  private int mN = -1;

  protected long targetX() {
    return 0;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    // There is an asymmetry in this problem depending on whether the first step
    // is in the X direction.  A first step in Y or Z is "equivalent" and can
    // be counted with multiplicity 2.  In both cases there is an additional
    // multiplicity of 2 for symmetry +1 versus -1.
    final Z a;
    if (targetX() == 0) {
      a = Z.valueOf(mWalker.count(mN, 2, 1, Lattices.Z3.origin(), mX));
      mWalker.clear();
    } else {
      final Z a1 = Z.valueOf(mWalker.count(mN, 1, 1, Lattices.Z3.origin(), mX));
      mWalker.clear();
      final Z a2 = Z.valueOf(mWalker.count(mN, 1, 1, Lattices.Z3.origin(), mXN));
      mWalker.clear();
      a = a1.add(a2);
    }
    final Z b = Z.valueOf(mWalker.count(mN, 4, targetX() == 0 ? 2 : 3, Lattices.Z3.origin(), mY));
    mWalker.clear();
    return a.add(b);
  }
}
