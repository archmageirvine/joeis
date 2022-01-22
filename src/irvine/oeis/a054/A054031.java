package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A054031 Numbers whose square contains exactly 3 distinct digits.
 * @author Sean A. Irvine
 */
public class A054031 implements Sequence {

  private Z mN = Z.valueOf(12);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Integer.bitCount(ZUtils.syn(mN.square())) == 3) {
        return mN;
      }
    }
  }
}

