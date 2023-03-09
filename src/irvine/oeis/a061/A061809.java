package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061809 When cubed gives number composed just of the digits 1, 2, 3, 4.
 * @author Sean A. Irvine
 */
public class A061809 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if ((ZUtils.syn(mN.pow(3)) & 0b1111100001) == 0) {
        return mN;
      }
    }
  }
}

