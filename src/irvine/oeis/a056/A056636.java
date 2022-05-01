package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a000.A000954;

/**
 * A056636.
 * @author Sean A. Irvine
 */
public class A056636 extends A000954 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.max(super.next());
    return mA;
  }
}
