package irvine.oeis.a336;

import irvine.math.lattice.Lattices;
import irvine.math.lattice.ParallelWalker;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A336724 Number of n-step self-avoiding walks on the half-Manhattan square lattice.
 * @author Sean A. Irvine
 */
public class A336724 implements Sequence {

  private final ParallelWalker mWalker = new ParallelWalker(8, () -> new SelfAvoidingWalker(Lattices.HALF_MANHATTAN));
  private final long mX1 = Lattices.HALF_MANHATTAN.neighbour(Lattices.HALF_MANHATTAN.origin(), 0);
  private final long mY1 = Lattices.HALF_MANHATTAN.neighbour(Lattices.HALF_MANHATTAN.origin(), 1);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    // There is only one horizontal direction to move in the first step,
    // but we can assume the first vertical step will be up (and double weight
    // thereafter).  Hence we use 1 for initial weight and 1 for axes (i.e.,
    // indicating no y-step has been taken).
    final Z a = Z.valueOf(mWalker.count(mN, 1, 1, Lattices.HALF_MANHATTAN.origin(), mX1));
    mWalker.clear();
    // Going up for the first step is equivalent to going down, hence symmetry 2
    // But horizontal steps are not symmetric so set axes to 0b11.
    final Z b = Z.valueOf(mWalker.count(mN, 2, 3, Lattices.HALF_MANHATTAN.origin(), mY1));
    mWalker.clear();
    return a.add(b);
  }
}
