package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000724 Invertible Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A000724 implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 30) {
      throw new UnsupportedOperationException();
    }
    Z sum = Z.ZERO;
    final Z fn = mF.factorial(mN);
    for (int k = 0; k <= (mN - 1) / 2; ++k) {
      sum = sum.add(fn.multiply(Z.ONE.shiftLeft(mN - 2 * k).subtract(1)).divide(mF.factorial(mN - 2 * k)).divide(mF.factorial(k)));
    }
    sum = sum.multiply(Z.ONE.shiftLeft(mN).subtract(1)).multiply(mF.factorial(1 << (mN - 1))).shiftLeft(1 << (mN - 1));
    return sum.add(mF.factorial(1 << mN)).shiftRight(2 * mN).divide(mF.factorial(mN));
  }
}
