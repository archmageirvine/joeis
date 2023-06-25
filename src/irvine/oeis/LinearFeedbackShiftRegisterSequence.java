package irvine.oeis;

import irvine.math.z.Z;

/**
 * Binary linear feedback shift register sequence of at most 63 bits.
 * @author Sean A. Irvine
 */
public class LinearFeedbackShiftRegisterSequence extends AbstractSequence {

  private static final int DEFOFF = 0;

  private long mFill;
  private final long mTaps;
  private final long mOutput;

  /**
   * Construct the sequence.
   * @param size length of the register
   * @param taps tap positions (in binary)
   * @param fill initial fill
   */
  public LinearFeedbackShiftRegisterSequence(final int size, final long taps, final long fill) {
    super(DEFOFF);
    mFill = fill;
    mTaps = taps;
    mOutput = 1L << size;
  }

  /**
   * Construct the sequence.
   * @param size length of the register
   * @param taps tap positions (in binary)
   */
  public LinearFeedbackShiftRegisterSequence(final int size, final long taps) {
    this(size, taps, 1);
  }

  @Override
  public Z next() {
    mFill = (mFill << 1) | (Long.bitCount(mFill & mTaps) & 1);
    return (mFill & mOutput) == 0 ? Z.ZERO : Z.ONE;
  }
}

