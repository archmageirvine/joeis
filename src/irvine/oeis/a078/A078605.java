package irvine.oeis.a078;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078605 Sum of square displacements over all self-avoiding n-step walks on the cubic lattice with the first step specified. Numerator of mean square displacement s(n)=a(n)/(A001412(n)/6).
 * @author Sean A. Irvine
 */
public class A078605 extends Sequence1 {

  private int mN = 0;
  private Z mTotal = Z.ZERO;
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z3) {
    {
      setAccumulator((walk, weight, axesMask) -> {
        final Z dist = Z.valueOf(Lattices.Z3.norm(walk[mN])).multiply(weight);
        synchronized (A078605.this) {
          mTotal = mTotal.add(dist);
        }
      });
    }
  });

  @Override
  public Z next() {
    mTotal = Z.ZERO;
    mWalker.count(++mN, 1, 1, Lattices.Z3.origin(), Lattices.Z3.neighbour(Lattices.Z3.origin(), 0));
    return mTotal;
  }
}
