package irvine.oeis.a004;

import irvine.math.turing.BlankTapeHalting;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a060.A060843;

/**
 * A004147 Number of n-state Turing machines which halt.
 * @author Sean A. Irvine
 * @author Gregory Morse
 */
public class A004147 extends Sequence1 {

  private final A060843 mStepMaximum = new A060843();
  private final long mFifth;
  private int mN = 0;

  /** Construct the sequence. */
  public A004147() {
    // Published five-state count; the exhaustive run is not part of this generator.
    this(26751695615616L);
  }

  protected A004147(final long fifth) {
    mFifth = fifth;
  }

  protected Z select(final BlankTapeHalting tally) {
    return tally.count();
  }

  @Override
  public Z next() {
    if (++mN < 5) {
      // This is a proved upper bound, not a heuristic simulation timeout.
      return select(BlankTapeHalting.tally(mN, mStepMaximum.a(mN).intValueExact()));
    }
    if (mN == 5) {
      return Z.valueOf(mFifth);
    }
    throw new UnsupportedOperationException("No further exact terms known");
  }
}
