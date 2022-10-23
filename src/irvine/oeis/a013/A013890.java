package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013890 a(n) = 19^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013890 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(19) : mA.multiply(2476099);
    return mA;
  }
}
