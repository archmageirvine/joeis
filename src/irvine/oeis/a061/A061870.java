package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A061870 Numbers such that |first digit - second digit + third digit - fourth digit ...| = 1.
 * @author Georg Fischer
 */
public class A061870 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A061870(final int offset) {
    super(offset);
  }

  private Z mK;
  private int mSum;
  private int mMode;

  /** Construct the sequence. */
  public A061870() {
    this(2, 1);
  }

  /**
   * Generic constructor with parameters
   * @param mode alternating, 1 = without abs, 2 = with abs.
   * @param sum required digit sum
   */
  public A061870(final int mode, final int sum) {
    super(1);
    mK = Z.ZERO;
    mSum = sum;
    mMode = mode;
  }

  /**
   * Computes the alternating sum of digits.
   * @param num String with digits
   * @return first digit - second digit + third digit and so on.
   */
  protected static int alternatingDigitSum(final String num) {
    int sum = 0;
    int sign = 1;
    for (int i = 0; i < num.length(); ++i) {
      sum += sign * Character.digit(num.charAt(i), 10);
      sign = -sign;
    }
    return sum;
  }

  @Override
  public Z next() {
    while (true) {
      mK = mK.add(1);
      final int sum = alternatingDigitSum(mK.toString());
      if ((sum > 0 || mMode == 1 ? sum : -sum) == mSum) {
        return mK;
      }
    }
  }
}
