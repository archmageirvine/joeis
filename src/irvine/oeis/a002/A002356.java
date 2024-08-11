package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002356 Numerators of convergents to cube root of 4.
 * @author Sean A. Irvine
 */
public class A002356 extends A002947 {

  {
    setOffset(0);
  }

  private Z mP0 = Z.ZERO;
  private Z mP1 = Z.ONE;

  @Override
  public Z next() {
    final Z a = super.next();
    final Z p = mP1.multiply(a).add(mP0);
    mP0 = mP1;
    mP1 = p;
    return p;
  }
}
