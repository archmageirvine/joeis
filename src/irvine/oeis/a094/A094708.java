package irvine.oeis.a094;

import irvine.math.z.Z;
import irvine.oeis.a057.A057561;

/**
 * A094708.
 * @author Sean A. Irvine
 */
public class A094708 extends A057561 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(super.next());
  }
}
