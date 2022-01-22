package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A054035 Numbers n such that n^2 contains exactly 7 different digits.
 * @author Sean A. Irvine
 */
public class A054035 implements Sequence {

  private Z mN = Z.valueOf(1016);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Integer.bitCount(ZUtils.syn(mN.square())) == 7) {
        return mN;
      }
    }
  }
}

