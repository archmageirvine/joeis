package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013783 a(n) = 5^(4*n + 3).
 * @author Sean A. Irvine
 */
public class A013783 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(125) : mA.multiply(625);
    return mA;
  }
}
