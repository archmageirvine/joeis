package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002362 Numerators of continued fraction convergents to fifth root of 2.
 * @author Sean A. Irvine
 */
public class A002362 extends A002950 {

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
