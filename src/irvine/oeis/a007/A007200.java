package irvine.oeis.a007;

import irvine.math.lattice.Accumulator;
import irvine.math.lattice.Lattices;
import irvine.math.lattice.SelfAvoidingWalker;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007200 Number of self-avoiding walks on hexagonal lattice, with additional constraints.
 * @author Sean A. Irvine
 */
public class A007200 extends AbstractSequence {

  private int mN;
  private final int mM;
  private final long mC = Lattices.HEXAGONAL.neighbour(Lattices.HEXAGONAL.origin(), 0);
  private final SelfAvoidingWalker mWalker = new SelfAvoidingWalker(Lattices.HEXAGONAL) {
    {
      setAccumulator(new Accumulator() {
        @Override
        public void accumulate(final long[] walk, final int weight, final int axesMask) {
          if (mN < mM) {
            return;
          }
          final long hi = walk[(mN - mM) / 2];
          final long lo = walk[(mN + mM) >>> 1];
          if (Lattices.HEXAGONAL.isAdjacent(lo, hi)) {
            increment(weight);
          }
          if (((mN ^ mM) & 1) == 1) {
            if (Lattices.HEXAGONAL.isAdjacent(lo, walk[(mN + mM - 1) / 2])) {
              increment(weight);
            }
          }
        }
      });
    }
  };

  protected A007200(final int m) {
    super(2);
    mM = m;
    mN = mM - 1;
  }

  /** Construct the sequence. */
  public A007200() {
    this(2);
  }

  @Override
  public Z next() {
    return Z.valueOf(mWalker.count(++mN, 6, 1, Lattices.HEXAGONAL.origin(), mC));
  }
}
