package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a002.A002805;
import irvine.oeis.a003.A003418;

/**
 * A112813 Numbers k such that lcm(1,2,3,...,k)/3 equals the denominator of the k-th harmonic number H(k).
 * @author Georg Fischer
 */
public class A112813 implements SequenceWithOffset {

  protected int mN; // used in A112818
  private int mOffset;
  private int mDivisor;
  private final Sequence mHarmSeq = new A002805(); // denominators of harmonic numbers
  private final Sequence mLCMnSeq = new A003418(); // LCM(seq(1..n))

  /** Construct the sequence. */
  public A112813() {
    this(1, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param divisor divisor of the LCM
   */
  public A112813(final int offset, final int divisor) {
    mN = 0;
    mOffset = offset;
    mDivisor = divisor;
    mLCMnSeq.next(); // skip a(0)
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mLCMnSeq.next().equals(mHarmSeq.next().multiply(mDivisor))) {
        return Z.valueOf(mN);
      }
    }
  }

  @Override
  public int getOffset() {
    return mOffset;
  }
}
