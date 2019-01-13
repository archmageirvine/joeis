package irvine.oeis;

import irvine.math.cr.Convergents;
import irvine.math.z.Z;

/**
 * A sequence generating the continued fraction of a computable real.
 * @author Sean A. Irvine
 */
public class ContinuedFractionSequence implements Sequence {

  private final DecimalExpansionSequence mSeq;
  protected long mN = -1;

  /**
   * Construct the sequence.
   * @param seq underlying decimal expansion sequence
   */
  public ContinuedFractionSequence(final DecimalExpansionSequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    mSeq.next(); // ensure precision
    // Re-step every time due to changing precision
    final Convergents conv = new Convergents(mSeq.getCR());
    ++mN;
    for (int k = 0; k <= mN; ++k) {
      conv.next();
    }
    return conv.frac();
  }

}
