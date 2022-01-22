package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A054032 Numbers n such that n^2 contains exactly 4 different digits.
 * @author Sean A. Irvine
 */
public class A054032 implements Sequence {

  private Z mN = Z.valueOf(12);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Integer.bitCount(ZUtils.syn(mN.square())) == 4) {
        return mN;
      }
    }
  }
}

