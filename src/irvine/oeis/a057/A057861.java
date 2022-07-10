package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A057853.
 * @author Sean A. Irvine
 */
public class A057861 extends A000045 {

  private Z mA = Z.ONE;
  {
    super.next();
  }

  @Override
  public Z next() {
    mA = mA.multiply2();
    return mA.divide(super.next());
  }
}
