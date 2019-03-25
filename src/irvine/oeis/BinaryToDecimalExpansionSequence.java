package irvine.oeis;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Convert a binary sequence into a real constant and expand as a decimal sequence.
 * @author Sean A. Irvine
 */
public class BinaryToDecimalExpansionSequence extends DecimalExpansionSequence {

  private final Sequence mBinarySeq;
  private final StringBuilder mBuf = new StringBuilder();
  private int mSteps = 0;
  private int mLimit = 100;
  private CR mBinary;

  protected BinaryToDecimalExpansionSequence(final Sequence binarySequence) {
    mBinarySeq = binarySequence;
    mBinary = stepBinary(mLimit);
  }

  private CR stepBinary(final int limit) {
    while (mSteps < limit) {
      mBuf.append(mBinarySeq.next());
      ++mSteps;
    }
    return CR.valueOf(new Q(new Z(mBuf, 2), Z.ONE.shiftLeft(mBuf.length())));
  }

  @Override
  protected void ensureAccuracy(final int n) {
    if (4 * n > mLimit) {
      mLimit *= 2;
      mBinary = stepBinary(mLimit);
    }
  }

  @Override
  protected CR getCR() {
    return mBinary;
  }
}
