package irvine.oeis.a000;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000765 Number of n-step self-avoiding walks on f.c.c. lattice ending at point with x = 0.
 * @author Sean A. Irvine
 */
public class A000765 extends AbstractSequence {

  /** Construct the sequence. */
  public A000765() {
    super(0);
  }

  private final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.FCC),
    () -> new SelfAvoidingWalker(Lattices.FCC) {
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
  private final long mA = Lattices.FCC.toPoint(1, 1, 0);
  private final long mAN = Lattices.FCC.toPoint(-1, 1, 0);
  private final long mB = Lattices.FCC.toPoint(0, 1, 1);
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
      a = Z.valueOf(mWalker.count(mN, 8, 7, Lattices.FCC.origin(), mA));
      mWalker.clear();
    } else {
      final Z a1 = Z.valueOf(mWalker.count(mN, 4, 7, Lattices.FCC.origin(), mA));
      mWalker.clear();
      final Z a2 = Z.valueOf(mWalker.count(mN, 4, 7, Lattices.FCC.origin(), mAN));
      mWalker.clear();
      a = a1.add(a2);
    }
    final Z b = Z.valueOf(mWalker.count(mN, 4, 7, Lattices.FCC.origin(), mB));
    mWalker.clear();
    return a.add(b);
  }
}

//public class A000765 extends A001336 {
//
//  // There is an asymmetry in this problem depending on whether the first step
//  // is in the X direction.  A first step in Y or Z is "equivalent" and can
//  // be counted with multiplicity 2.  In both cases there is an additional
//  // multiplicity of 2 for +1 versus -1.
//
//  @Override
//  protected long count(final int point) {
//    return x(point) == BIAS ? 1 : 0;
//  }
//
//  @Override
//  public Z next() {
//    if (++mN == 0) {
//      return Z.ONE;
//    }
//    setPathLength(mN);
//    setPathElement(0, ORIGIN);
//    return Z.valueOf(8 * count(ORIGIN + X1 + Y1, 1) + 4 * count(ORIGIN + Y1 + 1, 1));
//  }
//}
