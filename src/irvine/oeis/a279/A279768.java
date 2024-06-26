package irvine.oeis.a279;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A279768 Numbers n such that the sum of digits of 8n equals 16.
 * @author Georg Fischer
 */
public class A279768 extends Sequence1 {

  private Z mN;
  private final int mBase;
  private final int mSum;

  /** Construct the sequence. */
  public A279768() {
    this(8, 16);
  }

  /**
   * Generic constructor with parameters
   * @param base
   * @param sum
   */
  public A279768(final int base, final int sum) {
    mN = Z.ZERO;
    mBase = base;
    mSum = sum;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.DIGIT_SUM.l(mN.multiply(mBase)) == mSum) {
        return mN;
      }
    }
  }
}
