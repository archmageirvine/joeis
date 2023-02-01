package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061276.
 * @author Sean A. Irvine
 */
public class A061277 extends Sequence1 {

  private Z mN = Z.valueOf(108);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Integer.bitCount(ZUtils.syn(mN)) > Integer.bitCount(ZUtils.syn(mN.square()))) {
        return mN;
      }
    }
  }
}
