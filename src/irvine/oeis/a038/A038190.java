package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038190 Pagoda sequence: a(0) = b(n)-b(n-2) mod 3, where b(n) = A038189(n).
 * @author Sean A. Irvine
 */
public class A038190 extends A038189 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next();
    return mB.subtract(t).mod(Z.THREE);
  }
}
