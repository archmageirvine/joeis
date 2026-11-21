package irvine.oeis.a244;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A244494 Number of quadratic balanced Boolean functions of n variables.
 * @author Gregory Morse
 */
public class A244494 extends Sequence1 {
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z numerator = Z.ONE.shiftLeft(mN).subtract(1);
    Z denominator = Z.ONE;
    Z sum = numerator.multiply2();
    for (int h = 1; 2 * h < mN; ++h) {
      numerator = numerator.multiply(Z.ONE.shiftLeft(mN - 2L * h + 1).subtract(1)).multiply(Z.ONE.shiftLeft(mN - 2L * h).subtract(1));
      denominator = denominator.multiply(Z.ONE.shiftLeft(2L * h).subtract(1));
      sum = sum.add(numerator.shiftLeft((long) h * (h + 1) + 1).divide(denominator));
    }
    return sum;
  }
}
