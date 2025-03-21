package irvine.oeis.a076;

import irvine.math.z.Z;

/**
 * A076117 Cubes (or 0) from A076116.
 * @author Sean A. Irvine
 */
public class A076117 extends A076116 {

  @Override
  public Z next() {
    final Z k = super.next();
    return k.isZero() ? Z.ZERO : k.multiply2().add(mN - 1).multiply(mN).divide2();
  }
}
