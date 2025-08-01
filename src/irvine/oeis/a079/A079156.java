package irvine.oeis.a079;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A079156 Sum of end-to-end Manhattan distances over all self-avoiding n-step walks on cubic lattice. Numerator of mean Manhattan displacement s(n)=a(n)/A078717.
 * @author Sean A. Irvine
 */
public class A079156 extends Sequence2 {

  private int mN = 1;
  private Z mTotal = Z.ZERO;
  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.Z3) {
    {
      setAccumulator((walk, weight, axesMask) -> {
        final long pt = walk[mN];
        final long dist = Math.abs(Lattices.Z3.ordinate(pt, 0)) + Math.abs(Lattices.Z3.ordinate(pt, 1)) + Math.abs(Lattices.Z3.ordinate(pt, 2));
        final long inc = dist * weight;
        synchronized (A079156.this) {
          mTotal = mTotal.add(inc);
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
