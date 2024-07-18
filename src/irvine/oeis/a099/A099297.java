package irvine.oeis.a099;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000796;

/**
 * A099297 Number of times the digit 6 appears in the first 10^n digits of Pi.
 * @author Georg Fischer
 */
public class A099297 extends AbstractSequence {

  private long mK;
  private final Sequence mSeq;
  private final Z mDigit;
  private long mCount;
  private long mPow;
  private final long mBase;

  /** Construct the sequence. */
  public A099297() {
    this(1, new A000796().skip(1), 6, 10, 10);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence for decimal constant
   * @param digit count this digit
   * @param base count in powers of this base
   * @param start =1 or =base
   */
  public A099297(final int offset, final Sequence seq, final int digit, final int base, final long start) {
    super(offset);
    mSeq = seq;
    mDigit = Z.valueOf(digit);
    mBase = base;
    mCount = 0;
    mPow = start;
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      if (mDigit.equals(mSeq.next())) {
        ++mCount;
      }
      if (mK == mPow) {
        mPow *= mBase;
        return Z.valueOf(mCount);
      }
    }
  }
}
