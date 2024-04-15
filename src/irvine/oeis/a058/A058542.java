package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058542 Trajectory of 16 under map that sends x to 3x - sigma(x).
 * @author Sean A. Irvine
 */
public class A058542 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : mA.multiply(3).subtract(Functions.SIGMA.z(mA.abs()));
    return mA;
  }
}
