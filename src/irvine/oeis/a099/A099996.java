package irvine.oeis.a099;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A099996 a(n) = lcm{1, 2, ..., 2*n}.
 * @author Sean A. Irvine
 */
public class A099996 extends Sequence0 {

  protected long mN = -1;
  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mLcm = mLcm.lcm(Z.valueOf(mN)).lcm(Z.valueOf(++mN));
    }
    return mLcm;
  }
}
