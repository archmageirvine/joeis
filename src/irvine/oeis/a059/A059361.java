package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059361 a(1)=1; a(n) = A059333(a(n-1)) + a(n-1).
 * @author Sean A. Irvine
 */
public class A059361 extends A059333 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : f(mA).add(mA);
    return mA;
  }
}
