package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013891 a(n) = 19^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013891 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(361) : mA.multiply(2476099);
    return mA;
  }
}
