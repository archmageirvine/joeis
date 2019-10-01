package irvine.oeis;

import java.util.List;

import irvine.math.z.Z;

/**
 * Base case for certain periodic sequences generated verbatim from a list.
 * @author Sean A. Irvine
 */
public class PeriodicSequence implements Sequence {

  private final Z[] mSeq;
  private int mN = -1;

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public PeriodicSequence(final long... seq) {
    mSeq = new Z[seq.length];
    for (int k = 0; k < seq.length; ++k) {
      mSeq[k] = Z.valueOf(seq[k]);
    }
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public PeriodicSequence(final Z... seq) {
    mSeq = seq;
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public PeriodicSequence(final List<Z> seq) {
    mSeq = seq.toArray(new Z[0]);
  }

  @Override
  public Z next() {
    ++mN;
    mN %= mSeq.length;
    return mSeq[mN];
  }
}

