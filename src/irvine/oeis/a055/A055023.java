package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055023 a(n) = n/A055032(n).
 * @author Sean A. Irvine
 */
public class A055023 extends A055032 {

  @Override
  public Z next() {
    final Z den = super.next();
    return Z.valueOf(mN).divide(den);
  }
}
