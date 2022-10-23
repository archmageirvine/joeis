package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A054033 Numbers n such that n^2 contains exactly 5 different digits.
 * @author Sean A. Irvine
 */
public class A054033 extends Sequence1 {

  private Z mN = Z.valueOf(112);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Integer.bitCount(ZUtils.syn(mN.square())) == 5) {
        return mN;
      }
    }
  }
}

