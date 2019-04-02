package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005288 a(n) = C(n,5) + C(n,4) - C(n,3) + 1, n &gt;= 7.
 * @author Sean A. Irvine
 */
public class A005288 implements Sequence {

  private Z mN = Z.FIVE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.equals(Z.SIX)
      ? Z.THREE
      : mN.subtract(6).multiply(mN).add(3).multiply(mN).subtract(10).multiply(mN.subtract(3)).multiply(mN.add(4)).divide(120);
  }
}
