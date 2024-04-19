package irvine.oeis.a032;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032369 Hall normalization constants.
 * @author Sean A. Irvine
 */
public class A032369 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private Z mBarnesG = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    final int n = ++mN;
    mBarnesG = mBarnesG.multiply(Functions.FACTORIAL.z(n));
    final int n2 = mN * mN;
    if ((mN & 1) == 0) {
      return Functions.FACTORIAL.z(n2 / 2 - 1).shiftLeft(n2 - mN).divide(mBarnesG);
    } else {
      return Functions.FACTORIAL.z(n2 - 1).divide(mBarnesG).divide(Functions.FACTORIAL.z((n2 - 1) / 2)).shiftRight(mN - 1);
    }
  }
}
