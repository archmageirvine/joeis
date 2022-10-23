package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A002582 Largest prime factor of n! - 1.
 * @author Sean A. Irvine
 */
public class A002582 extends Sequence2 {

  private Z mF = Z.ONE;
  private int mN = 1;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return Jaguar.factor(mF.subtract(1)).largestPrimeFactor();
  }
}
