package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002351 Denominators of convergents to cube root of 2.
 * @author Sean A. Irvine
 */
public class A002351 extends A002945 {

  private Z mQ0 = Z.ONE;
  private Z mQ1 = Z.ZERO;

  @Override
  public Z next() {
    final Z a = super.next();
    final Z q = mQ1.multiply(a).add(mQ0);
    mQ0 = mQ1;
    mQ1 = q;
    return q;
  }
}
