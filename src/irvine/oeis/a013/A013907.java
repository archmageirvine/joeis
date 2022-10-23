package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013907 a(n) = 23^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013907 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(529) : mA.multiply(6436343);
    return mA;
  }
}
