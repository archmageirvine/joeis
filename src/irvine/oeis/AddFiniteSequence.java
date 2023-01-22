package irvine.oeis;

import irvine.math.z.Z;

/**
 * Add a finite number of long terms to the initial terms of another sequence.
 * Optionally, a number of leading terms of the underlying sequence are skipped first.
 * The offset is not relevant here.
 * This sequences is similar to {@link PrependSequence}, except that it adds the terms instead of replacing them.
 * @author Georg Fischer
 */
public class AddFiniteSequence implements Sequence {

  private final Sequence mSeq;
  private final long[] mInitTerms;
  private final int mInitLen;
  private int mN;

  /**
   * Construct the sequence.
   * @param skip number of leading terms of the underlying sequence to be skipped first.
   * @param seq the underlying sequence
   * @param initTerms list of terms to be added to the leading terms of <code>seq</code>
   */
  public AddFiniteSequence(int skip, final Sequence seq, final long... initTerms) {
    mSeq = seq;
    mInitTerms = initTerms;
    mInitLen = mInitTerms.length;
    mN = -1;
    while (--skip >= 0) {
      mSeq.next();
    }
  }

  /**
   * Construct the sequence without skipping leading terms.
   * @param seq the underlying sequence
   * @param initTerms list of terms to be added to the leading terms of <code>seq</code>
   */
  public AddFiniteSequence(final Sequence seq, final long... initTerms) {
    this(0, seq, initTerms);
  }

  @Override
  public Z next() {
    ++mN;
    return mN < mInitLen ? mSeq.next().add(mInitTerms[mN]) : mSeq.next();
  }
}
