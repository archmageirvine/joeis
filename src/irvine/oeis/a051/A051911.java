package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051911 Triangle T(n,m) = Nim-product of n and m, read by rows, 1&lt;=n&lt;=m.
 * @author Sean A. Irvine
 */
public class A051911 extends A051775 {

  private Z mN = Z.ZERO;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    mM = mM.add(1);
    if (mM.compareTo(mN) > 0) {
      mN = mN.add(1);
      mM = Z.ONE;
    }
    return get(mN, mM);
  }
}
