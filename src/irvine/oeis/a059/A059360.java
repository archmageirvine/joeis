package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059360 a(n) = A059333(2^n).
 * @author Sean A. Irvine
 */
public class A059360 extends A059333 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return f(mA);
  }
}
