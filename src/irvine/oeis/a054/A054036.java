package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A054036 Numbers n such that n^2 contains exactly 8 different digits.
 * @author Sean A. Irvine
 */
public class A054036 implements Sequence {

  private Z mN = Z.valueOf(3205);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Integer.bitCount(ZUtils.syn(mN.square())) == 8) {
        return mN;
      }
    }
  }
}

