package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A090000 Length of longest contiguous block of 1's in binary expansion of n-th prime.
 * @author jmason
 * @author Sean A. Irvine
 */
public class A090000 extends AbstractSequence {

  private final Sequence mSeq;
  private final int mBit;
  private int mN;

  /** Construct the sequence. */
  public A090000() {
    this(1, new A000040(), 1);
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence
   * @param bit contiguous block of these bits
   */
  public A090000(final Sequence seq, final int bit) {
    this(1, seq, bit);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param bit contiguous block of these bits
   */
  public A090000(final int offset, final Sequence seq, final int bit) {
    super(offset);
    mSeq = seq;
    mBit = bit;
    mN = -1;
  }

  /* Calculate the maximum length of the longest contiguous block of 1's in binary expansion of n */
  protected static int maxBitLength(final Z p, final int bit) {
    int currMax = 0;
    int currLen = 0;
    for (int k = 0; k < p.bitLength(); ++k) {
      if ((p.testBit(k) ? 1 : 0) == bit) {
        if (++currLen > currMax) {
          currMax = currLen;
        }
      } else {
        currLen = 0;
      }
    }
    return currMax;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0 && mBit == 0) {
      mSeq.next();
      return Z.ONE;
    }
    return Z.valueOf(maxBitLength(mSeq.next(), mBit));
  }
}
