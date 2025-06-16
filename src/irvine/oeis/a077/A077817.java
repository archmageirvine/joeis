package irvine.oeis.a077;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A077817 Number of self-avoiding walks on the cubic lattice trapped after n steps.
 * @author Sean A. Irvine
 */
public class A077817 extends AbstractSequence {

  /** Construct the sequence. */
  public A077817() {
    super(11);
  }

  protected final ParallelWalker mWalker = new ParallelWalker(8,
    () -> new SelfAvoidingWalker(Lattices.Z3),
    () -> new SelfAvoidingWalker(Lattices.Z3) {
      {
        setAccumulator((walk, weight, axesMask) -> {
          final long pt = walk[walk.length - 1];
          // Check if all neighbours are already present
          for (int j = 0; j < Lattices.Z3.neighbourCount(pt); ++j) {
            final long q = Lattices.Z3.neighbour(pt, j);
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
  private int mN = 10;

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 1, 1, Lattices.Z3.origin(), Lattices.Z3.toPoint(1, 0, 0)) / 8);
  }
}
