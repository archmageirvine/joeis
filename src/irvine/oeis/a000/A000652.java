package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000652 Invertible Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A000652 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 29) {
      throw new UnsupportedOperationException();
    }
    if (mN == 0) {
      return Z.ONE;
    }
    final int u = (1 << mN) - 1;
    final Z t = Functions.FACTORIAL.z(1 << (mN - 1)).multiply(u).multiply(u).shiftLeft(1L << (mN - 1));
    return Functions.FACTORIAL.z(1 << mN).add(t).shiftRight(2L * mN);
  }
}
