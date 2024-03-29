package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013910 a(n) = 24^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013910 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(24) : mA.multiply(7962624);
    return mA;
  }
}
