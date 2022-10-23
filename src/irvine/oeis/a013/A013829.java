package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013829 a(n) = 3^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013829 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(81) : mA.multiply(243);
    return mA;
  }
}
