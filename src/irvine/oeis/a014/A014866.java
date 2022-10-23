package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014866 Numbers k that divide s(k), where s(1)=1, s(j)=16*s(j-1)+j.
 * @author Sean A. Irvine
 */
public class A014866 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 1) {
        mA = mA.multiply(16).add(mN);
      }
      if (mA.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
