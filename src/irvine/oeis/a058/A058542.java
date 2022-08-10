package irvine.oeis.a058;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058542 Trajectory of 16 under map that sends x to 3x - sigma(x).
 * @author Sean A. Irvine
 */
public class A058542 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : mA.multiply(3).subtract(Jaguar.factor(mA.abs()).sigma());
    return mA;
  }
}
