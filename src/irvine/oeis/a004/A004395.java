package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004395.
 * @author Sean A. Irvine
 */
public class A004395 extends A004396 {

  private Z mA = null;

  {
    super.next();
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(super.next());
    return mA;
  }
}
