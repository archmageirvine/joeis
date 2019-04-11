package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013908 <code>a(n) = 23^(5*n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A013908 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(12167) : mA.multiply(6436343);
    return mA;
  }
}
