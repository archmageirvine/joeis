package irvine.oeis.a004;

import irvine.math.turing.BlankTapeHalting;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004147 Number of n-state Turing machines which halt.
 * @author Sean A. Irvine
 * @author Gregory Morse
 */
public class A004147 extends Sequence1 {

  private final long mFifth;
  private int mN = 0;

  /** Construct the sequence. */
  public A004147() {
    // Five-state shortcut checked by the internal BusyBeaver verifier.
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
      return select(BlankTapeHalting.smallTally(mN));
    }
    if (mN == 5) {
      return Z.valueOf(mFifth);
    }
    throw new UnsupportedOperationException("No further exact terms known");
  }
}
