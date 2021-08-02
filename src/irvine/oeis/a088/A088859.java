package irvine.oeis.a088;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A088859 a(n) = L(n) + 2^n where L(n) = A000032(n) (the Lucas numbers).
 * @author Sean A. Irvine
 */
public class A088859 extends A000032 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return super.next().add(mA);
  }
}
