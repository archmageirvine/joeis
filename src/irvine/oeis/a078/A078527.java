package irvine.oeis.a078;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A078528 Number of unconstrained walks on square lattice trapped after n steps.
 * @author Sean A. Irvine
 */
public class A078527 extends AbstractSequence {

  /** Construct the sequence. */
  public A078527() {
    super(7);
  }

  protected final SelfAvoidingWalker mWalker = new SelfAvoidingWalker(Lattices.Z2) {

    private int mMaxC2 = 0;

    {
      setAccumulator((walk, weight, axesMask) -> {
        // First check is trapped
        final long last = walk[walk.length - 1];
        // Check if all neighbours are already present
        for (int j = 0; j < Lattices.Z2.neighbourCount(last); ++j) {
          final long q = Lattices.Z2.neighbour(last, j);
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

        // Compute total number of 2 constrained points
        int c2 = 0;
        for (int k = 1; k < walk.length - 1; ++k) {
          final long pt = walk[k];
          int cnt = 0;
          for (int j = 0; j < Lattices.Z2.neighbourCount(pt); ++j) {
            final long q = Lattices.Z2.neighbour(pt, j);
            for (int i = 0; i < k; ++i) {
              if (walk[i] == q) {
                ++cnt;
                break;
              }
            }
          }
          if (cnt >= 2) {
            ++c2;
          }
        }
        if (c2 >= mMaxC2) {
          if (c2 > mMaxC2) {
            // Found a new maximum number of 2-constrained, reset the count
            mMaxC2 = c2;
            mCount = 0;
          }
          if (mMaxC2 > 0) {
            increment(weight);
          }
        }
      });
    }
  };
  private int mN = 6;

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 1, 1, Lattices.Z2.origin(), Lattices.Z2.toPoint(1, 0)) / 2);
  }
}
