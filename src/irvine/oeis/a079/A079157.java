package irvine.oeis.a079;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A079157 Sum of square displacements over all self-avoiding walks on cubic lattice trapped after n steps. Numerator of mean square displacement a(n)/A077817(n).
 * @author Sean A. Irvine
 */
public class A079157 extends AbstractSequence {

  /** Construct the sequence. */
  public A079157() {
    super(11);
  }

  private int mN = 10;
  private Z mTotal = Z.ZERO;
  private final ParallelWalker mWalker = new ParallelWalker(8,
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
        final Z dist = Z.valueOf(Lattices.Z3.norm(walk[mN])).multiply(weight);
        synchronized (A079157.this) {
          mTotal = mTotal.add(dist);
        }
      });
    }
  });

  @Override
  public Z next() {
    mTotal = Z.ZERO;
    mWalker.count(++mN, 1, 1, Lattices.Z3.origin(), Lattices.Z3.neighbour(Lattices.Z3.origin(), 0));
    return mTotal.divide(8);
  }
}
