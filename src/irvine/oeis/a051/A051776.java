package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051776 Table T(n,m) = Nim-product of n and m, read by antidiagonals, for n &gt;= 1, m &gt;= 1.
 * @author Sean A. Irvine
 */
public class A051776 extends A051775 {

  private Z mN = Z.ONE;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    mM = mM.subtract(1);
    if (mM.signum() <= 0) {
      mM = mN;
      mN = mN.add(1);
    }
    return get(mN.subtract(mM), mM);
  }
}
