package irvine.oeis.a178;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A178465.
 * @author Sean A. Irvine
 */
public class A178465 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isEven()) {
      return mN.square().add(2).multiply(mN).divide2();
    } else if (Z.ONE.equals(mN)) {
      return Z.ZERO;
    } else {
      return mN.square().subtract(mN).add(2).multiply(mN.add(1)).divide2();
    }
  }
}
