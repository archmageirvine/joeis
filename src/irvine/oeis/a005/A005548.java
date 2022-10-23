package irvine.oeis.a005;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A005548 Number of n-step self-avoiding walks on f.c.c. lattice from (0,0,0) to (2,2,2).
 * @author Sean A. Irvine
 */
public class A005548 extends Sequence3 {

  // We set this up to search from (2,2,2) to (0,0,0)

  private int mN;
  private final long mTarget;
  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.FCC),
    () -> new SelfAvoidingWalker(Lattices.FCC) {
      {
        setAccumulator((walk, weight, axesMask) -> {
          if (walk[walk.length - 1] == mLattice.origin()) {
            increment(weight);
          }
        });
      }

      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        return super.isAcceptable(point, remainingSteps) && mLattice.distanceBound(point) <= remainingSteps;
      }
    });

  protected A005548(final long x, final long y, final long z, final int start) {
    mTarget = Lattices.FCC.toPoint(x, y, z);
    mN = start;
  }

  /** Construct the sequence. */
  public A005548() {
    this(2, 2, 2, 2);
  }

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 1, 7, mTarget));
  }
}
