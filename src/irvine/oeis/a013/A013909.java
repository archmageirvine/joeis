package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013909 a(n) = 23^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013909 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(279841) : mA.multiply(6436343);
    return mA;
  }
}
