package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A049504 a(n) = Product_{i = 0..n-1} ((3*i+1)!*(6*i)!*(2*i)!)/((4*i)!*(4*i+1)!).
 * @author Sean A. Irvine
 */
public class A049504 extends Sequence0 {

  private Z mA = Z.ONE;
  private int mN = -2;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Functions.FACTORIAL.z(3 * mN + 1))
        .multiply(Functions.FACTORIAL.z(6 * mN))
        .multiply(Functions.FACTORIAL.z(2 * mN))
        .divide(Functions.FACTORIAL.z(4 * mN))
        .divide(Functions.FACTORIAL.z(4 * mN + 1));
    }
    return mA;
  }
}
