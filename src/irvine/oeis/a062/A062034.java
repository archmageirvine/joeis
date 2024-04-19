package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062034 Positive numbers whose product of digits is twice the sum of the digits.
 * @author Georg Fischer
 */
public class A062034 extends Sequence1 {

  private long mN;
  private final int mMult;

  /** Construct the sequence. */
  public A062034() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param mult
   */
  public A062034(final int mult) {
    mN = 0;
    mMult = mult;
  }

  @Override
  public Z next() {
    ++mN;
    while (Functions.DIGIT_PRODUCT.l(mN) != Functions.DIGIT_SUM.l(mN) * mMult) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
