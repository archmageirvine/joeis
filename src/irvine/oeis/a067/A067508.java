package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A067508 Powers of 4 with digit sum divisible by 4.
 * @author Georg Fischer
 */
public class A067508 extends AbstractSequence {

  private final int mBase;
  private Z mPow;

  /** Construct the sequence. */
  public A067508() {
    this(1, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param base base and divisor
   */
  public A067508(final int offset, final int base) {
    super(offset);
    mPow = Z.ONE;
    mBase = base;
  }

  @Override
  public Z next() {
    mPow = mPow.multiply(mBase);
    while (Functions.DIGIT_SUM.l(mPow) % mBase != 0) {
      mPow = mPow.multiply(mBase);
    }
    return mPow;
  }
}
