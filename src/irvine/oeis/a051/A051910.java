package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051910 Triangle T(n,m) = Nim-product of n and m, read by rows, 0&lt;=m&lt;=n.
 * @author Sean A. Irvine
 */
public class A051910 extends A051775 {

  private Z mN = Z.NEG_ONE;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    mM = mM.add(1);
    if (mM.compareTo(mN) > 0) {
      mN = mN.add(1);
      mM = Z.ZERO;
    }
    return get(mN, mM);
  }
}
