package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A134210 Positions of 10 after the decimal point in the decimal expansion of Pi.
 * @author Georg Fischer
 */
public class A134210 extends A000796 {

  private int mN;
  private final int mDigit10;
  private final int mDigit1;
  private int mState;

  /** Construct the sequence. */
  public A134210() {
    this(10);
  }

  /**
   * Generic constructor with parameter
   * @param digitPair desired digits - caution: must be different!
   */
  public A134210(final int digitPair) {
    mN = 0;
    mDigit10 = digitPair / 10;
    mDigit1 = digitPair % 10;
    super.next(); // skip over "3."
    mState = 1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final int digitPi = super.next().intValue();
      if (mState == 1) {
        if (digitPi == mDigit10) {
          mState = 2;
        }
      } else if (mState == 2) {
        if (digitPi == mDigit1) {
          mState = 1;
          return Z.valueOf(mN - 1);
        } else if (digitPi != mDigit10) {
          mState = 1;
        }
      }
    }
  }
}
