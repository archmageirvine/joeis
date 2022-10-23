package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002776 Terms in certain determinants.
 * @author Sean A. Irvine
 */
public class A002776 extends Sequence0 {

  private Z mN = Z.NEG_ONE;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (Z.ONE.compareTo(mN) < 0) {
      mF = mF.multiply(mN);
    }
    return mF.multiply(mN.add(1).multiply(mN).add(2).multiply(mN).add(1));
  }
}
