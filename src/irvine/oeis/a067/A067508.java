package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A067508 Powers of 4 with digit sum divisible by 4.
 * @author Georg Fischer
 */
public class A067508 extends AbstractSequence {

  private int mBase;
  private Z mPow;

  /** Construct the sequence. */
  public A067508() {
    this(4);
  }

  /**
   * Generic constructor with parameters
   * @param base base and divisor
   */
  public A067508(final int base) {
    super(0);
    mPow = Z.ONE;
    mBase = base;
  }

  @Override
  public Z next() {
    mPow = mPow.multiply(mBase);
    while (ZUtils.digitSum(mPow) % mBase != 0) {
      mPow = mPow.multiply(mBase);
    }
    return mPow;
  }
}
