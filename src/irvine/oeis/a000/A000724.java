package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000724 Invertible Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A000724 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 30) {
      throw new UnsupportedOperationException();
    }
    Z sum = Z.ZERO;
    final Z fn = Functions.FACTORIAL.z(mN);
    for (int k = 0; k <= (mN - 1) / 2; ++k) {
      sum = sum.add(fn.multiply(Z.ONE.shiftLeft(mN - 2L * k).subtract(1)).divide(Functions.FACTORIAL.z(mN - 2 * k)).divide(Functions.FACTORIAL.z(k)));
    }
    sum = sum.multiply(Z.ONE.shiftLeft(mN).subtract(1)).multiply(Functions.FACTORIAL.z(1 << (mN - 1))).shiftLeft(1L << (mN - 1));
    return sum.add(Functions.FACTORIAL.z(1 << mN)).shiftRight(2L * mN).divide(Functions.FACTORIAL.z(mN));
  }
}
