package irvine.oeis.a078;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A078799 Sum of square displacements over all self-avoiding walks on square lattice trapped after n steps.
 * @author Sean A. Irvine
 */
public class A078799 extends AbstractSequence {

  private Z mTotal = Z.ZERO;

  /** Construct the sequence. */
  public A078799() {
    super(7);
  }

  protected final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z2),
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
          final Z dist = Z.valueOf(Lattices.Z2.norm(walk[mN])).multiply(weight);
          synchronized (A078799.this) {
            mTotal = mTotal.add(dist);
          }
        });
      }
    });
  private int mN = 6;

  @Override
  public Z next() {
    mTotal = Z.ZERO;
    mWalker.count(++mN, 1, 1, Lattices.Z2.origin(), Lattices.Z2.toPoint(1, 0));
    return mTotal.divide2();
  }
}
