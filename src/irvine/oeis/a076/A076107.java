package irvine.oeis.a076;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076107 First of n consecutive integers whose sum is a positive n-th power, or 0 if no such integers exist.
 * @author Sean A. Irvine
 */
public class A076107 extends Sequence1 {

  // After Max Alekseyev

  private int mN = 0;

  @Override
  public Z next() {
    if ((++mN & 3) == 0) {
      return Z.ZERO;
    }
    final long m = Functions.MAKE_ODD.l(mN);
    return Jaguar.factor(m).squareFreeKernel().pow(mN).multiply2().divide(mN).subtract(mN - 1).divide2();
  }
}
