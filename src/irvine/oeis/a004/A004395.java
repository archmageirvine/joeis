package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004395 Ratios of successive terms are 1,1,2,3,3,4,5,5,6,7,7,...
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
