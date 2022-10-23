package irvine.oeis.a032;

import irvine.math.factorial.MemoryFactorial;
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
    mBarnesG = mBarnesG.multiply(mF.factorial(++mN));
    final int n2 = mN * mN;
    if ((mN & 1) == 0) {
      return mF.factorial(n2 / 2 - 1).shiftLeft(n2 - mN).divide(mBarnesG);
    } else {
      return mF.factorial(n2 - 1).divide(mBarnesG).divide(mF.factorial((n2 - 1) / 2)).shiftRight(mN - 1);
    }
  }
}
