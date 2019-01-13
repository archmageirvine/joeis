package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence alternating between the values of two other sequences.  For example, can be used
 * to interleave a sequence of odd and even terms.
 * @author Sean A. Irvine
 */
public class AlternatingSequence implements Sequence {

  private final Sequence mA;
  private final Sequence mB;
  private boolean mFirst = false;

  /**
   * Create a sequence alternating between the two given sequences.
   * @param seqA first sequence
   * @param seqB second sequence
   */
  public AlternatingSequence(final Sequence seqA, final Sequence seqB) {
    mA = seqA;
    mB = seqB;
  }

  @Override
  public Z next() {
    mFirst = !mFirst;
    return mFirst ? mA.next() : mB.next();
  }
}
