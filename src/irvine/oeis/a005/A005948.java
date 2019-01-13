package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005948.
 * @author Sean A. Irvine
 */
public class A005948 extends A005947 {

  @Override
  public Z next() {
    return mQ.get(++mN, 3).multiply(get(mN, 3)).multiply(mN).toZ();
  }
}
