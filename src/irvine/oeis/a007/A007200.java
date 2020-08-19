package irvine.oeis.a007;

import irvine.math.lattice.Accumulator;
import irvine.math.lattice.HexagonalLattice;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007200 Number of self-avoiding walks on hexagonal lattice, with additional constraints.
 * @author Sean A. Irvine
 */
public class A007200 implements Sequence {

  private int mN;
  private final int mM;
  private final HexagonalLattice mHexagonalLattice = new HexagonalLattice();
  private final long mC = mHexagonalLattice.neighbour(mHexagonalLattice.origin(), 0);
  private final SelfAvoidingWalker mWalker = new SelfAvoidingWalker(mHexagonalLattice) {
    {
      setAccumulator(new Accumulator() {
        @Override
        public void accumulate(final long[] walk, final int weight, final int axesMask) {
          if (mN < mM) {
            return;
          }
          final long hi = walk[(mN - mM) / 2];
          final long lo = walk[(mN + mM) >>> 1];
          if (mHexagonalLattice.isAdjacent(lo, hi)) {
            increment(weight);
          }
          if (((mN ^ mM) & 1) == 1) {
            if (mHexagonalLattice.isAdjacent(lo, walk[(mN + mM - 1) / 2])) {
              increment(weight);
            }
          }
        }
      });
    }
  };

  protected A007200(final int m) {
    mM = m;
    mN = mM - 1;
  }

  /** Construct the sequence. */
  public A007200() {
    this(2);
  }

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 6, 1, mHexagonalLattice.origin(), mC));
  }
}
