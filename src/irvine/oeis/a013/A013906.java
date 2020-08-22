package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013906 a(n) = 23^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013906 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(23) : mA.multiply(6436343);
    return mA;
  }
}
