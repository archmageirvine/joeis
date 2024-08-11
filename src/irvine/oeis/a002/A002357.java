package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002357 Denominators of convergents to cube root of 5.
 * @author Sean A. Irvine
 */
public class A002357 extends A002948 {

  {
    setOffset(0);
  }

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
