package irvine.oeis;

import java.util.Arrays;
import java.util.Collection;

import irvine.math.z.Z;

/**
 * Base case for certain finite sequence generated verbatim from a list.
 * @author Sean A. Irvine
 */
public class FiniteSequence implements Sequence {

  private final Z[] mSeq;
  private int mN = 0;

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public FiniteSequence(final long... seq) {
    mSeq = new Z[seq.length];
    for (int k = 0; k < seq.length; ++k) {
      mSeq[k] = Z.valueOf(seq[k]);
    }
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public FiniteSequence(final Z... seq) {
    mSeq = seq;
  }

  /**
   * Construct the sequence.
   * @param seq the values
   */
  public FiniteSequence(final Collection<Z> seq) {
    mSeq = seq.toArray(new Z[0]);
  }

  @Override
  public Z next() {
    return mN < mSeq.length ? mSeq[mN++] : null;
  }

  /**
   * Directly return the specified element of this sequence.
   * @param index index (from 0)
   * @return specified element
   */
  public Z a(final int index) {
    return mSeq[index];
  }

  /**
   * Gets the finite list of terms.
   * @return array of terms
   */
  public Z[] getInitTerms() {
    return Arrays.copyOf(mSeq, mSeq.length);
  }

}

