package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078523.
 * @author Sean A. Irvine
 */
public class A078530 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.NEG_ONE.pow((mN - 1) * ((mN / 12) & 1))
      .multiply(Z.THREE.pow((mN - 4) * (mN - 4) / 8 + (mN % 12 == 0 ? 1 : 0)))
      .multiply(1 + (mN % 12 == 6 ? 1 : 0))
      .multiply(Long.signum(mN % 12));
  }
}
