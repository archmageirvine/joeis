package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013841 a(n) = 6^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013841 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(1296) : mA.multiply(7776);
    return mA;
  }
}
