package irvine.oeis.a000;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000652 Invertible Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A000652 implements Sequence {

  private int mN = -1;
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;

  @Override
  public Z next() {
    if (++mN > 29) {
      throw new UnsupportedOperationException();
    }
    if (mN == 0) {
      return Z.ONE;
    }
    final int u = (1 << mN) - 1;
    final Z t = mF.factorial(1 << (mN - 1)).multiply(u).multiply(u).shiftLeft(1 << (mN - 1));
    return mF.factorial(1 << mN).add(t).shiftRight(2 * mN);
  }
}
