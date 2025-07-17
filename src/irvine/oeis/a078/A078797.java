package irvine.oeis.a078;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078797 Sum of square displacements over all self-avoiding n-step walks on a square lattice with the first step specified. Numerator of mean square displacement s(n)=a(n)/A046661(n).
 * @author Sean A. Irvine
 */
public class A078797 extends Sequence1 {

  private int mN = 0;
  private Z mTotal = Z.ZERO;
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z2) {
    {
      setAccumulator((walk, weight, axesMask) -> {
        final Z dist = Z.valueOf(Lattices.Z2.norm(walk[mN])).multiply(weight);
        synchronized (A078797.this) {
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
