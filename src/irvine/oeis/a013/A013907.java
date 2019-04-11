package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013907 <code>a(n) = 23^(5*n + 2)</code>.
 * @author Sean A. Irvine
 */
public class A013907 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(529) : mA.multiply(6436343);
    return mA;
  }
}
