package irvine.oeis.a038;

import java.util.HashSet;

import irvine.math.lattice.Accumulator;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingCycler;
import irvine.math.lattice.Walker;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A038516 Total number of different legs traversed by all loops of length 2n in A038515.
 * @author Sean A. Irvine
 */
public class A038516 extends Sequence0 implements Accumulator {

  private final HashSet<Pair<Long, Long>> mSeen = new HashSet<>();
  private int mN = -2;
  private final long mC = Lattices.DIAMOND.neighbour(Lattices.DIAMOND.origin(), 0);
  private final Walker mWalker = new SelfAvoidingCycler(Lattices.DIAMOND, true);
  {
    mWalker.setAccumulator(this);
  }

  @Override
  public void accumulate(final long[] walk, final int weight, final int axesMask) {
    for (int k = 1; k < walk.length; ++k) {
      final long a = walk[k - 1];
      final long b = walk[k];
      mSeen.add(a < b ? new Pair<>(a, b) : new Pair<>(b, a));
    }
  }

  @Override
  public Z next() {
    mN += 2;
    mSeen.clear();
    mWalker.count(mN, 1, 15, Lattices.DIAMOND.origin(), mC);
    return mN == 0 ? Z.ZERO : Z.valueOf(mSeen.size());
  }

}
