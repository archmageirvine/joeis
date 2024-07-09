package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002361 Denominators of continued fraction convergents to fifth root of 2.
 * @author Sean A. Irvine
 */
public class A002361 extends A002950 {

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
