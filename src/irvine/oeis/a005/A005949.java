package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005949.
 * @author Sean A. Irvine
 */
public class A005949 extends A005947 {

  @Override
  public Z next() {
    return mQ.get(++mN, 4).multiply(get(mN, 4)).multiply(mN).toZ();
  }
}
