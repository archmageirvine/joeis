package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046715 Secondary root edges in doubly rooted tree maps with n edges.
 * @author Sean A. Irvine
 */
public class A046715 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    } else if (mN > 1) {
      mA = mA.multiply(mN).multiply(4 * mN * mN - 1).multiply(4).divide(mN + 2).divide(mN * mN - 1);
    }
    return mA;
  }
}
