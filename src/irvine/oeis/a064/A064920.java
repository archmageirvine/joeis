package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A064920 a(n) = n/gpf(n) + gpf(n) - 1, where gpf = A006530 = greatest prime factor.
 * @author Sean A. Irvine
 */
public class A064920 extends Sequence2 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z gpf = Jaguar.factor(mN).largestPrimeFactor();
    return mN.divide(gpf).add(gpf).subtract(1);
  }
}

