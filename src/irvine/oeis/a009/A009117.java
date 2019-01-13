package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009117.
 * @author Sean A. Irvine
 */
public class A009117 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.equals(Z.ONE) ? Z.valueOf(-2) : mA.multiply(-4);
    return mA;
  }
}
