package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067481 Powers of 3 with initial digit 3.
 * @author Georg Fischer
 */
public class A067481 extends Sequence1 {

  private final int mBase;
  private final int mDigit;
  protected int mN;
  private Z mPow;

  /** Construct the sequence. */
  public A067481() {
    this(3, 3);
  }

  /**
   * Generic constructor with parameters
   * @param base take the power of this number
   * @param digit required leading digit
   */
  public A067481(final int base, final int digit) {
    mBase = base;
    mDigit = digit;
    mPow = Z.ONE;
    mN = 0;
  }

  @Override
  public Z next() {
    while (mPow.toString().charAt(0) - '0' != mDigit) {
      mPow = mPow.multiply(mBase);
      ++mN;
    }
    final Z result = mPow;
    mPow = mPow.multiply(mBase);
    ++mN;
    return result;
  }
}
