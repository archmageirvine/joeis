package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056195 a(n) = n! divided by its characteristic cube divisor A056194.
 * @author Sean A. Irvine
 */
public class A056195 extends A056194 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z t = super.next();
    mF = mF.multiply(mN);
    return mF.divide(t);
  }
}
