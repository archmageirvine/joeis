package irvine.oeis.a078;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A078528 Number of unconstrained walks on square lattice trapped after n steps.
 * @author Sean A. Irvine
 */
public class A078528 extends AbstractSequence {

  /** Construct the sequence. */
  public A078528() {
    super(7);
  }

  protected final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z2) {
      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        if (!super.isAcceptable(point, remainingSteps)) {
          return false;
        }
        int cnt = 0;
        for (int j = 0; j < Lattices.Z2.neighbourCount(point); ++j) {
          if (!contains(Lattices.Z2.neighbour(point, j), remainingSteps)) {
            ++cnt;
          }
        }
        return cnt > 2;
      }
    },
    () -> new SelfAvoidingWalker(Lattices.Z2) {
      {
        setAccumulator((walk, weight, axesMask) -> {
          final long pt = walk[walk.length - 1];
          // Check if all neighbours are already present
          for (int j = 0; j < Lattices.Z2.neighbourCount(pt); ++j) {
            final long q = Lattices.Z2.neighbour(pt, j);
            boolean ok = false;
            for (int k = 0; k < walk.length - 1; ++k) {
              if (walk[k] == q) {
                ok = true;
                break;
              }
            }
            if (!ok) {
              return;
            }
          }
          increment(weight);
        });
      }

      @Override
      protected boolean isAcceptable(final long point, final int remainingSteps) {
        if (!super.isAcceptable(point, remainingSteps)) {
          return false;
        }
        if (remainingSteps <= 1) {
          return true;
        }
        int cnt = 0;
        for (int j = 0; j < Lattices.Z2.neighbourCount(point); ++j) {
          if (!contains(Lattices.Z2.neighbour(point, j), remainingSteps)) {
            ++cnt;
          }
        }
        return cnt > 2;
      }
    });
  private int mN = 6;

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 1, 1, Lattices.Z2.origin(), Lattices.Z2.toPoint(1, 0)) / 2);
  }
}
