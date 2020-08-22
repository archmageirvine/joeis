package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013860 a(n) = 11^(5*n + 3).
 * @author Sean A. Irvine
 */
public class A013860 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(1331) : mA.multiply(161051);
    return mA;
  }
}
