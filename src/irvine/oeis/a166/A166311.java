package irvine.oeis.a166;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A166311 Numbers whose sum of digits is 11.
 * @author Georg Fischer
 */
public class A166311 extends Sequence1 {

  private Z mN;
  private int mSum;

  /** Construct the sequence. */
  public A166311() {
    this(11);
  }

  /**
   * Generic constructor with parameters
   * @param sum desired sum of digits
   */
  public A166311(final int sum) {
    mN = Z.ZERO;
    mSum = sum;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.DIGIT_SUM.l(mN) == mSum) {
        return mN;
      }
    }
  }
}
