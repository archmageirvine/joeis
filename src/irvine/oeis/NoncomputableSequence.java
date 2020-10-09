package irvine.oeis;

import java.util.Collection;

import irvine.math.z.Z;

/**
 * Base case for certain finite sequences generated verbatim from a list.
 * Same as FiniteSequence, but throws <code>UnsupportedOperationException</code> at the end.
 * @author Georg Fischer
 */
public class NoncomputableSequence implements Sequence {

  private final Z[] mSeq;
  private int mN = 0;

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public NoncomputableSequence(final long... seq) {
    mSeq = new Z[seq.length];
    for (int k = 0; k < seq.length; ++k) {
      mSeq[k] = Z.valueOf(seq[k]);
    }
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public NoncomputableSequence(final Z... seq) {
    mSeq = seq;
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public NoncomputableSequence(final Collection<Z> seq) {
    mSeq = seq.toArray(new Z[0]);
  }

  @Override
  public Z next() {
    if (mN < mSeq.length) {
      return mSeq[mN++];
    } else {
      throw new UnsupportedOperationException("no further terms known");
    }
  }
}

