package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058545 Trajectory of 23 under map that sends x to 3x - sigma(x), where sigma(x) is the sum of the divisors of x.
 * @author Sean A. Irvine
 */
public class A058545 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(23) : mA.multiply(3).subtract(Jaguar.factor(mA.abs()).sigma());
    return mA;
  }
}
