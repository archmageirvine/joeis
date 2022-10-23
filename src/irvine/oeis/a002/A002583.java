package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002583 Largest prime factor of n! + 1.
 * @author Sean A. Irvine
 */
public class A002583 extends Sequence0 {

  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return Jaguar.factor(mF.add(1)).largestPrimeFactor();
  }
}
