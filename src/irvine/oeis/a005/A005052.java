package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005052 a(n) = 10*3^n.
 * @author Sean A. Irvine
 */
public class A005052 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TEN : mA.multiply(3);
    return mA;
  }
}

