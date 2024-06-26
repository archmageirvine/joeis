package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058545 Trajectory of 23 under map that sends x to 3x - sigma(x), where sigma(x) is the sum of the divisors of x.
 * @author Sean A. Irvine
 */
public class A058545 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(23) : mA.multiply(3).subtract(Functions.SIGMA1.z(mA.abs()));
    return mA;
  }
}
