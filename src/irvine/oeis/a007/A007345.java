package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007345.
 * @author Sean A. Irvine
 */
public class A007345 implements Sequence {

  private int mN = -1;
  private final MemoryFactorial mF = new MemoryFactorial();

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int q = 0; q <= 2 * mN; ++q) {
      for (int j = Math.max(0, mN - q); j <= (2 * mN - q) / 2; ++j) {
        sum = sum.add(mF.factorial(mN)
          .multiply(mF.factorial(4 * mN - 2 * q - 2 * j))
          .divide(mF.factorial(2 * mN - q - 2 * j))
          .divide(mF.factorial(j + 1))
          .divide(mF.factorial(2 * mN - q - j).square())
          .divide(mF.factorial(q - mN + j)));
      }
    }
    return sum;
  }
}
