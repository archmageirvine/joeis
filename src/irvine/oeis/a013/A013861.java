package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013861 a(n) = 11^(5*n+4).
 * @author Sean A. Irvine
 */
public class A013861 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(14641) : mA.multiply(161051);
    return mA;
  }
}
