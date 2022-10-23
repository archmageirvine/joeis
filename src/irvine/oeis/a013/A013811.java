package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013811 a(n) = 19^(4*n + 3).
 * @author Sean A. Irvine
 */
public class A013811 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(6859) : mA.multiply(130321);
    return mA;
  }
}
