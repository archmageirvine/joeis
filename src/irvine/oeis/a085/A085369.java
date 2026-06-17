package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000572;

/**
 * A085369 Cutting sequence for 1/e.
 * @author Sean A. Irvine
 */
public class A085369 extends A000572 {

  private long mA = super.next().longValueExact();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mA) {
      mA = super.next().longValueExact();
      return Z.ZERO;
    }
    return Z.ONE;
  }
}
