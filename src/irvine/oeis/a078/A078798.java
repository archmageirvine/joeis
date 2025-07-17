package irvine.oeis.a078;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078798 Sum of Manhattan distances over all self-avoiding n-step walks on square lattice. Numerator of mean Manhattan displacement s(n) = a(n)/A046661(n).
 * @author Sean A. Irvine
 */
public class A078798 extends Sequence1 {

  private int mN = 0;
  private Z mTotal = Z.ZERO;
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z2) {
    {
      setAccumulator((walk, weight, axesMask) -> {
        final long pt = walk[mN];
        final Z dist = Z.valueOf(Math.abs(Lattices.Z2.ordinate(pt, 0)) + Math.abs(Lattices.Z2.ordinate(pt, 1))).multiply(weight);
        synchronized (A078798.this) {
          mTotal = mTotal.add(dist);
        }
      });
    }
  });

  @Override
  public Z next() {
    mTotal = Z.ZERO;
    mWalker.count(++mN, 1, 1, Lattices.Z2.origin(), Lattices.Z2.neighbour(Lattices.Z2.origin(), 0));
    return mTotal;
  }
}
