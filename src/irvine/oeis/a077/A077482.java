package irvine.oeis.a077;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A077482 Number of self-avoiding walks on square lattice trapped after n steps.
 * @author Sean A. Irvine
 */
public class A077482 extends AbstractSequence {

  /** Construct the sequence. */
  public A077482() {
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
          increment(weight);
        });
      }
    });
  private int mN = 6;

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 1, 1, Lattices.Z2.origin(), Lattices.Z2.toPoint(1, 0)) / 2);
  }
}
