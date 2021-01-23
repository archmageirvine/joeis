package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005032 a(n) = 7*3^n.
 * @author Sean A. Irvine
 */
public class A005032 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : mA.multiply(3);
    return mA;
  }
}

